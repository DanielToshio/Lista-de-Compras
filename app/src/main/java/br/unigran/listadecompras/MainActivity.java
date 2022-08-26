package br.unigran.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText produto;
    EditText marca;
    EditText quantidade;
    List<Produtos> dados;
    ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produto=findViewById(R.id.produtoid);
        marca=findViewById(R.id.marcaid);
        quantidade=findViewById(R.id.quantidadeid);

        dados = new ArrayList();
        listagem = findViewById(R.id.listaid);
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dados);
        listagem.setAdapter(adapter);

    }
    public void salvar (View view){
        Produtos lista = new Produtos();
        lista.setProduto(produto.getText().toString());
        lista.setMarca(marca.getText().toString());
        lista.setQuantidade(quantidade.getText().toString());
        dados.add(lista);
        Toast.makeText(this,"Item salvo",Toast.LENGTH_SHORT).show();
    }
}