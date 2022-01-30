package com.example.notificacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button btnNotificarProg = (Button) findViewById(R.id.btnNotificar);
        btnNotificarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = "50% de desconto para homens";
                String titulo = "Promoção dia dos namorados";
                notificarUsuario(mensagem,titulo);
            }
            //método notificarUsuario
            //Parâmetros do tipo texto: Mensagem e titulo
            private void notificarUsuario (String mensagem, String titulo) {
            //Objeto "notificacao" para receber os parâmetros e construir a estrutura de notificação
                NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                //Construindo o título da notificação
                notificacao.setContentTitle(titulo);
                //Construindo a mensagem da notificação
                notificacao.setContentText(mensagem);
                //Construindo a prioridade da notificação
                notificacao.setPriority(Notification.PRIORITY_HIGH);
                //Construindo o ícone da notificação
                notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                //Quando o usuário clicar na notificação, ela será excluída da gaveta de notificações
                notificacao.setAutoCancel(true);
                //Construindo a intenção que chama a Activity promoção
                //quando o usuário clicar na mensagem
                Intent it = new Intent(getBaseContext(), promocao.class);
                //Utilizando o PendingIntent para que o Android consiga executar a Activity
                //do seu projeto
                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100,it, PendingIntent.FLAG_UPDATE_CURRENT);
                //Atribuindo na notificação a intenção que será executada, quando o usuário
                //clicar na notificação
                notificacao.setContentIntent(pit);
                //Criando o objeto para gerenciar e gerar a notificação no Android
                NotificationManager notificar = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                //Executando a notificação com o id fixo: 9000
                notificar.notify(9000, notificacao.build());

            }
        });
        Button btnNotificar2Prog = (Button) findViewById(R.id.btnNotificar2);
        btnNotificar2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = "50% de desconto para mulheres";
                String titulo = "Promoção dia dos namorados";
                notificarUsuario2 (mensagem, titulo);
            }
            private void notificarUsuario2 (String mensagem, String titulo) {
                NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                notificacao.setContentTitle(titulo);
                notificacao.setContentText(mensagem);
                notificacao.setPriority(Notification.PRIORITY_HIGH);
                notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                notificacao.setAutoCancel(true);
                Intent it = new Intent(getBaseContext(), promocao2.class);
                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100,it, PendingIntent.FLAG_UPDATE_CURRENT);
                notificacao.setContentIntent(pit);
                NotificationManager notificar = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                notificar.notify(9001, notificacao.build());
            }
        });
        }
    }
