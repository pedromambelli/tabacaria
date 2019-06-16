/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import tabacaria.models.Caixa;
import tabacaria.models.Categoria;
import tabacaria.models.Cliente;
import tabacaria.models.Compra;
import tabacaria.models.Data;
import tabacaria.models.Estoque;
import tabacaria.models.Fornecedor;
import tabacaria.models.Funcionario;
import tabacaria.models.Item;
import tabacaria.models.Produto;
import tabacaria.models.Transacao;
import tabacaria.models.Venda;

/**
 *
 * @author pedro
 */
public class Arquivo {
    
    public static boolean save(ArrayList<Categoria> categorias, ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios, ArrayList<Fornecedor> fornecedores
            , Estoque estoque, Caixa caixa, String path) throws IOException{
    
        
        JSONObject tabacariaJSON = new JSONObject();
        JSONArray categoriasJSON = new JSONArray();

        for(int i =0; i<categorias.size(); i++){
            Categoria cat =categorias.get(i);
            JSONObject categoriaJSON = new JSONObject();
            categoriaJSON.put("Nome", cat.getNome());
            categoriaJSON.put("Descricao", cat.getDescricao());
            categoriaJSON.put("Taxa", cat.getTaxa());
            categoriasJSON.add(categoriaJSON);
        }

        JSONArray clientesJSON = new JSONArray();


        for(int i =0; i<clientes.size(); i++){
            Cliente c =clientes.get(i);
            JSONObject clienteJSON = new JSONObject();
            clienteJSON.put("Nome", c.getNome());
            clienteJSON.put("CPF", c.getCPF());
            
            JSONObject dataJSON = new JSONObject();
            
            dataJSON.put("dia", c.getNascimento().getDia());
            dataJSON.put("mes", c.getNascimento().getMes());
            dataJSON.put("ano", c.getNascimento().getAno());
            
            clienteJSON.put("Data", dataJSON);
            
            clientesJSON.add(clienteJSON);
        }
        
        JSONArray funcionariosJSON = new JSONArray();


        for(int i =0; i<funcionarios.size(); i++){
            Funcionario f =funcionarios.get(i);
            JSONObject funcionarioJSON = new JSONObject();
            funcionarioJSON.put("Nome", f.getNome());
            funcionarioJSON.put("CPF", f.getCPF());
            funcionarioJSON.put("Salario", String.format(Locale.US, "%.2f", f.getSalario()));
            funcionarioJSON.put("Acesso", f.getAcesso());
            funcionarioJSON.put("Senha", f.getSenha());
            funcionariosJSON.add(funcionarioJSON);
        }
        
        JSONArray fornecedoresJSON = new JSONArray();


        for(int i =0; i<fornecedores.size(); i++){
            Fornecedor f = fornecedores.get(i);
            JSONObject fornecedorJSON = new JSONObject();
            fornecedorJSON.put("Nome", f.getNome());
            fornecedorJSON.put("CNPJ", f.getCNPJ());
            fornecedorJSON.put("Telefone", f.getTelefone());
            fornecedoresJSON.add(fornecedorJSON);
        }
        
        JSONArray estoqueJSON = new JSONArray();


        for(int i =0; i<estoque.produtosDiferentes(); i++){
            Item item = estoque.getItem(i);
            JSONObject itemJSON = new JSONObject();
            itemJSON.put("Nome", item.getProduto().getNome());
            itemJSON.put("Descricao", item.getProduto().getDescricao());
            itemJSON.put("PCusto", item.getProduto().getpCompra());
            itemJSON.put("PVenda", item.getProduto().getpVenda());
            itemJSON.put("Categoria", item.getProduto().getCategoria().getNome());
            itemJSON.put("Quantidade", item.getQuantidade());
            estoqueJSON.add(itemJSON);
        }
        
        JSONObject caixaJSON = new JSONObject();
        caixaJSON.put("saldo", caixa.getSaldo());
        
        JSONArray fluxoJSON = new JSONArray();
        
        for(int i =0; i<caixa.getFluxo().size(); i++){ // para cada transação
            Transacao t = caixa.getFluxo().get(i);
            JSONObject tJSON = new JSONObject();
            if(t instanceof Compra){
                Compra c = (Compra) t;
                tJSON.put("Fornecedor", c.getFornecedor().getNome() );
                tJSON.put("Tipo", "compra");
            }
            
            if(t instanceof Venda){
                Venda v = (Venda) t;
                tJSON.put("Cliente", v.getCliente().getNome());
                tJSON.put("Tipo", "venda");
            }
            
            JSONArray pedidoJSON = new JSONArray();
            
            for(int j = 0; j < t.getLista().size(); j++){
                Item item = t.getLista().get(j);
                JSONObject itemJSON = new JSONObject();
                itemJSON.put("Nome", item.getProduto().getNome());
                itemJSON.put("Descricao", item.getProduto().getDescricao());
                itemJSON.put("PCusto", String.format(Locale.US, "%.2f", item.getProduto().getpCompra()));
                itemJSON.put("PVenda", String.format(Locale.US, "%.2f", item.getProduto().getpVenda()));
                itemJSON.put("Categoria", item.getProduto().getCategoria().getNome());
                itemJSON.put("Quantidade", item.getQuantidade());
                pedidoJSON.add(itemJSON);
            }
            tJSON.put("Pedido", pedidoJSON);
            tJSON.put("ID", t.getId());
            
            fluxoJSON.add(tJSON); // add a transacao ao fluxo
            
            
            
        }
        
        caixaJSON.put("fluxo", fluxoJSON);
        
        

        tabacariaJSON.put("categorias", categoriasJSON);
        tabacariaJSON.put("clientes", clientesJSON);
        tabacariaJSON.put("funcionarios", funcionariosJSON);
        tabacariaJSON.put("fornecedores", fornecedoresJSON);
        tabacariaJSON.put("estoque", estoqueJSON);
        tabacariaJSON.put("caixa", caixaJSON);
        
        
        try (FileWriter file = new FileWriter(path)) {
            file.write(tabacariaJSON.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + tabacariaJSON);
            return true;
        }
    
    
    }
    
    public static boolean load(ArrayList<Categoria> categorias, ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios, ArrayList<Fornecedor> fornecedores
            , Estoque estoque, Caixa caixa, String path) throws ParseException, FileNotFoundException, IOException{
        JSONParser parser = new JSONParser();
        
        categorias.clear();
        funcionarios.clear();
        clientes.clear();
        fornecedores.clear();
        estoque.clear();
        caixa.clear(0);
        //Salva no objeto JSONObject o que o parse tratou do arquivo
        JSONObject tabacaria = (JSONObject) parser.parse(new FileReader(path));

        JSONArray categoriasJSON = (JSONArray) tabacaria.get("categorias");
        JSONArray clientesJSON = (JSONArray) tabacaria.get("clientes");
        JSONArray funcionariosJSON = (JSONArray) tabacaria.get("funcionarios");
        JSONArray fornecedoresJSON = (JSONArray) tabacaria.get("fornecedores");
        JSONArray estoqueJSON = (JSONArray) tabacaria.get("estoque");
        JSONObject caixaJSON = (JSONObject) tabacaria.get("caixa");
        JSONArray fluxoJSON = (JSONArray) caixaJSON.get("fluxo");





        for(int i =0; i<categoriasJSON.size(); i++){
            Categoria cat = new Categoria();
            JSONObject categoriaJSON = (JSONObject) categoriasJSON.get(i);
            cat.setNome((String) categoriaJSON.get("Nome"));
            cat.setDescricao((String) categoriaJSON.get("Descricao"));
            cat.setTaxa((float) (double) categoriaJSON.get("Taxa"));
            categorias.add(cat);
        }

        for(int i =0; i<clientesJSON.size(); i++){
            Cliente c = new Cliente();
            JSONObject clienteJSON = (JSONObject) clientesJSON.get(i);
            c.setNome((String) clienteJSON.get("Nome"));
            c.setCPF((long) clienteJSON.get("CPF"));
            c.setNascimento(
                new Data((int) (long)((JSONObject)clienteJSON.get("Data")).get("dia")
                , (int) (long) ((JSONObject)clienteJSON.get("Data")).get("mes")
                , (int) (long) ((JSONObject)clienteJSON.get("Data")).get("ano"))
            );
            clientes.add(c);
        }


        for(int i =0; i<funcionariosJSON.size(); i++){
            Funcionario f = new Funcionario();
            JSONObject funcionarioJSON = (JSONObject) funcionariosJSON.get(i);
            f.setNome((String) funcionarioJSON.get("Nome"));
            f.setCPF((long) funcionarioJSON.get("CPF"));
            f.setSalario(Float.parseFloat((String) funcionarioJSON.get("Salario")));
            f.setSenha((String) funcionarioJSON.get("Senha"));
            f.setAcesso((int) (long) funcionarioJSON.get("Acesso"));
            funcionarios.add(f);
        }

        for(int i =0; i<fornecedoresJSON.size(); i++){
            Fornecedor f = new Fornecedor();
            JSONObject fornecedorJSON = (JSONObject) fornecedoresJSON.get(i);
            f.setNome((String) fornecedorJSON.get("Nome"));
            f.setCNPJ((long) fornecedorJSON.get("CNPJ"));
            f.setTelefone((long) fornecedorJSON.get("Telefone"));

            fornecedores.add(f);
        }

        for(int i =0; i<fluxoJSON.size(); i++){ // para cada transação

            JSONObject transacaoJSON = (JSONObject) fluxoJSON.get(i);
            if("compra".equals((String) transacaoJSON.get("Tipo"))) //se for uma compra
            {
                Compra c = new Compra(); // instancio compra
                for(int j = 0; j < fornecedores.size(); j++){ // para cada fornecedor no sistema, busco o nome
                    Fornecedor f = fornecedores.get(j);
                    if(f.getNome().equals((String) transacaoJSON.get("Fornecedor"))) //quando encontro, atribuo-o à compra
                        c.setFornecedor(f);
                }

                JSONArray pedidoJSON = (JSONArray) transacaoJSON.get("Pedido");

                for(int k =0; k<pedidoJSON.size(); k++){ // para cada item no pedido

                    JSONObject itemJSON = (JSONObject) pedidoJSON.get(k);
                    Produto p = new Produto();
                    p.setNome((String) itemJSON.get("Nome"));
                    p.setDescricao((String) itemJSON.get("Descricao"));
                    p.setpCompra(Float.parseFloat((String) itemJSON.get("PCusto")));
                    p.setpVenda(Float.parseFloat((String) itemJSON.get("PVenda")));

                    for(int z = 0; z < categorias.size(); z++){ // para cada fornecedor no sistema, busco o nome
                        Categoria cat = categorias.get(i);
                        if(cat.getNome().equals((String) transacaoJSON.get("Categoria"))) //quando encontro, atribuo-o à compra
                            p.setCategoria(cat);
                    }
                    int quantidade = (int) (long) itemJSON.get("Quantidade");
                    Item item = new Item(p, quantidade);

                    c.getLista().add(item);





                }

                for(int k =0; k< c.getLista().size(); k++){ // para cada item presente na nova lista de compras
                    estoque.incluir(c.getLista().get(k)); //incluo no estoque os produtos

                }


                caixa.gravaMovimentacao(c);


            }

        }
        for(int i =0; i<fluxoJSON.size(); i++){ // para cada transação

            JSONObject transacaoJSON = (JSONObject) fluxoJSON.get(i);
            if("venda".equals((String) transacaoJSON.get("Tipo"))) //se for uma venda
            {
                Venda v = new Venda(); // instancio venda
                for(int j = 0; j < clientes.size(); j++){ // para cada cliente no sistema, busco o nome
                    Cliente c = clientes.get(j);
                    System.out.println((String) transacaoJSON.get("Cliente"));
                    System.out.println(c.getNome());
                    if(c.getNome().equals((String) transacaoJSON.get("Cliente"))) //quando encontro, atribuo-o à venda
                        v.setCliente(c);
                }

                JSONArray pedidoJSON = (JSONArray) transacaoJSON.get("Pedido");

                for(int k =0; k<pedidoJSON.size(); k++){ // para cada item no pedido

                    JSONObject itemJSON = (JSONObject) pedidoJSON.get(k);
                    Produto p = new Produto();
                    p.setNome((String) itemJSON.get("Nome"));
                    p.setDescricao((String) itemJSON.get("Descricao"));
                    p.setpCompra(Float.parseFloat((String) itemJSON.get("PCusto")));
                    p.setpVenda(Float.parseFloat((String) itemJSON.get("PVenda")));

                    for(int z = 0; z < categorias.size(); z++){ // para cada categoria no sistema, busco o nome
                        Categoria cat = categorias.get(i);
                        if(cat.getNome().equals((String) transacaoJSON.get("Categoria"))) //quando encontro, atribuo-o à compra
                            p.setCategoria(cat);
                    }
                    int quantidade = (int) (long) itemJSON.get("Quantidade");
                    Item item = new Item(p, quantidade);

                    v.getLista().add(item);





                }

                for(int k =0; k< v.getLista().size(); k++){ // para cada item presente na nova lista de compras
                    estoque.vender(v.getLista().get(k).getProduto().getNome(),v.getLista().get(k).getQuantidade() ); //incluo no estoque os produtos

                }


                caixa.gravaMovimentacao(v);


            }

        }


     


    return false;
        
    
    }


}
