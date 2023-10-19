
package com.mycompany.interface1;


import javax.swing.*;

public class Interface1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JogoInterface::new);
    }

    public static class JogoInterface extends JFrame {

        private boolean encontrouEscritor = false;

        public JogoInterface() {
            setTitle("Jogo Akinator dos Escritores Nacionais");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            iniciarJogo();
        }

        private void iniciarJogo() {
            JOptionPane.showMessageDialog(this,
                    "Bem-vindo ao Jogo Akinator dos Escritores Nacionais!\n" +
                            "Pense em um escritor e clique em OK.");

            while (!encontrouEscritor) {
                boolean isHomem = perguntaGeral("Seu escritor é homem? (S/N)");

                if (isHomem) {
                    boolean machadoAssis = perguntaMachadoAssis();
                    if (machadoAssis) {
                        JOptionPane.showMessageDialog(this, "Seu escritor é Machado de Assis!");
                        encontrouEscritor = true;
                    } else {
                        boolean gracilianoRamos = perguntaGracilianoRamos();
                        if (gracilianoRamos) {
                            JOptionPane.showMessageDialog(this, "Seu escritor é Graciliano Ramos!");
                            encontrouEscritor = true;
                        } else {
                            naoEncontrado();
                        }
                    }
                } else {
                    boolean clariceLispector = perguntaClariceLispector();
                    if (clariceLispector) {
                        JOptionPane.showMessageDialog(this, "Sua escritora é Clarice Lispector!");
                        encontrouEscritor = true;
                    } else {
                        boolean ceciliaMeireles = perguntaCeciliaMeireles();
                        if (ceciliaMeireles) {
                            JOptionPane.showMessageDialog(this, "Sua escritora é Cecília Meireles!");
                            encontrouEscritor = true;
                        } else {
                            boolean carlosDrummond = perguntaCarlosDrummond();
                            if (carlosDrummond) {
                                JOptionPane.showMessageDialog(this, "Seu escritor é Carlos Drummond de Andrade!");
                                encontrouEscritor = true;
                            } else {
                                naoEncontrado();
                            }
                        }
                    }
                }
            }

            dispose(); // Fecha a janela após o jogo terminar
        }

        private boolean perguntaGeral(String pergunta) {
            int resposta = JOptionPane.showConfirmDialog(this, pergunta, "Pergunta", JOptionPane.YES_NO_OPTION);
            return resposta == JOptionPane.YES_OPTION;
        }

        private boolean perguntaMachadoAssis() {
            return perguntaGeral("Seu escritor trabalhou como jornalista? (S/N)")
                    && perguntaGeral("Seu escritor fez parte do movimento literário 'Romantismo'? (S/N)")
                    && perguntaGeral("Seu escritor foi casado? (S/N)")
                    && perguntaGeral("Seu escritor escreveu um livro com tom humorístico? (S/N)")
                    && perguntaGeral("É dito que seu escritor escreveu a primeira narrativa fantástica do Brasil? (S/N)");
        }

        private boolean perguntaGracilianoRamos() {
            return perguntaGeral("Seu escritor fez parte do movimento literário 'Modernismo'? (S/N)")
                    && perguntaGeral("Seu escritor nasceu no estado Alagoas? (S/N)")
                    && perguntaGeral("Seu escritor foi casado? (S/N)")
                    && perguntaGeral("Seu escritor escreveu sobre o sertão nordestino? (S/N)")
                    && perguntaGeral("Seu escritor já foi preso? (S/N)");
        }

        private boolean perguntaCarlosDrummond() {
            return perguntaGeral("Seu escritor fez parte do movimento literário 'Modernismo'? (S/N)")
                    && perguntaGeral("Seu escritor foi casado? (S/N)")
                    && perguntaGeral("Seu escritor tem parentesco com uma atriz famosa? (S/N)")
                    && perguntaGeral("Seu escritor teve filhos? (S/N)")
                    && perguntaGeral("Seu escritor escreveu poemas importantes durante a ditadura militar no Brasil? (S/N)");
        }

        private boolean perguntaClariceLispector() {
            return perguntaGeral("Sua escritora foi casada? (S/N)")
                    && perguntaGeral("Sua escritora teve filhos? (S/N)")
                    && perguntaGeral("Sua escritora escreveu romances? (S/N)")
                    && perguntaGeral("Sua escritora era judia? (S/N)")
                    && perguntaGeral("Sua escritora diz que sua escrita não é cabível de classificação? (S/N)");
        }

        private boolean perguntaCeciliaMeireles() {
            return perguntaGeral("Sua escritora já foi casada? (S/N)")
                    && perguntaGeral("Sua escritora fez parte do movimento literário 'Parnasianismo'? (S/N)")
                    && perguntaGeral("Sua escritora era católica? (S/N)")
                    && perguntaGeral("Sua escritora escreveu poemas? (S/N)")
                    && perguntaGeral("Sua escritora fez um poema famoso sobre Tiradentes? (S/N)");
        }

        private void naoEncontrado() {
            JOptionPane.showMessageDialog(this, "Não foi possível adivinhar o escritor. Por favor, tente novamente.");
        }
    }
}
