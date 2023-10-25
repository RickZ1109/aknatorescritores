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
                    "Bem-vindo ao Jogo de Advinhação dos Escritores Nacionais!\n"
                    + "                Pense em um escritor e clique em OK.");

            while (!encontrouEscritor) {
                boolean isHomem = perguntaGeral("Seu escritor é homem? (Sim/Não)");

                if (isHomem) {
                    boolean machadoAssis = perguntaMachadoAssis();
                    if (machadoAssis) {
                        JOptionPane.showMessageDialog(this, "Seu escritor é Machado de Assis!");
                        encontrouEscritor = true;
                    } else {
                        boolean carlosDrummond = perguntaCarlosDrummond();
                        if (carlosDrummond) {
                            JOptionPane.showMessageDialog(this, "Seu escritor é Carlos Drummond de Andrade!");
                            encontrouEscritor = true;
                        } else {
                            boolean manuelBandeira = perguntaManuelBandeira();
                            if (manuelBandeira) {
                                JOptionPane.showMessageDialog(this, "Seu escritor é Manuel Bandeira!");
                                encontrouEscritor = true;
                            } else {
                                boolean guimaraesRosa = perguntaGuimaraesRosa();
                                if (guimaraesRosa) {
                                    JOptionPane.showMessageDialog(this, "Seu escritor é Guimarães Rosa!");
                                    encontrouEscritor = true;
                                } else {
                                    boolean marioAndrade = perguntaMarioAndrade();
                                    if (marioAndrade) {
                                        JOptionPane.showMessageDialog(this, "Seu escritor é Mário de Andrade!");
                                        encontrouEscritor = true;
                                    } else {
                                        boolean castroAlves = perguntaCastroAlves();
                                        if (castroAlves) {
                                            JOptionPane.showMessageDialog(this, "Seu escritor é Castro Alves!");
                                            encontrouEscritor = true;
                                        } else {
                                            naoEncontrado();
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    boolean coraCoralina = perguntaCoraCoralina();
                    if (coraCoralina) {
                        JOptionPane.showMessageDialog(this, "Sua escritora é Cora Coralina!");
                        encontrouEscritor = true;
                    } else {
                        boolean lygiaFagundesTelles = perguntaLygiaFagundesTelles(); // Adição de Lygia Fagundes Telles
                        if (lygiaFagundesTelles) {
                            JOptionPane.showMessageDialog(this, "Sua escritora é Lygia Fagundes Telles!");
                            encontrouEscritor = true;
                        } else {
                            boolean ceciliaMeireles = perguntaCeciliaMeireles();
                            if (ceciliaMeireles) {
                                JOptionPane.showMessageDialog(this, "Sua escritora é Cecília Meireles!");
                                encontrouEscritor = true;
                            } else {
                                boolean clariceLispector = perguntaClariceLispector();
                                if (clariceLispector) {
                                    JOptionPane.showMessageDialog(this, "Sua escritora é Clarice Lispector!");
                                    encontrouEscritor = true;
                                } else {
                                    boolean hildaHilst = perguntaHildaHilst(); // Adição de Hilda Hilst
                                    if (hildaHilst) {
                                        JOptionPane.showMessageDialog(this, "Sua escritora é Hilda Hilst!");
                                        encontrouEscritor = true;
                                    } else {
                                        boolean conceicaoEvaristo = perguntaConceicaoEvaristo(); // Adição de Conceição Evaristo
                                        if (conceicaoEvaristo) {
                                            JOptionPane.showMessageDialog(this, "Sua escritora é Conceição Evaristo!");
                                            encontrouEscritor = true;
                                        } else {
                                            naoEncontrado();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            dispose();
        }

        private boolean perguntaGeral(String pergunta) {
            int resposta = JOptionPane.showOptionDialog(this, pergunta, "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Sim", "Não"}, null);
            return resposta == JOptionPane.YES_OPTION;
        }

        private boolean perguntaMachadoAssis() {
            return perguntaGeral("Seu escritor trabalhou como jornalista? (Sim/Não)")
                    && perguntaGeral("Seu escritor fez parte do movimento literário 'Romantismo'? (Sim/Não)")
                    && perguntaGeral("Seu escritor escreveu um livro com tom humorístico? (Sim/Não)")
                    && perguntaGeral("É dito que seu escritor escreveu a primeira narrativa fantástica do Brasil? (Sim/Não)");
        }

        private boolean perguntaCarlosDrummond() {
            return perguntaGeral("Seu escritor tem parentesco com uma atriz famosa? (Sim/Não)")
                    && perguntaGeral("Seu escritor teve filhos? (Sim/Não)")
                    && perguntaGeral("Seu escritor escreveu poemas importantes durante a ditadura militar no Brasil? (Sim/Não)");
        }

        private boolean perguntaManuelBandeira() {
            return !perguntaGeral("Seu escritor morou no antigo estado do Brasil chamado Guanabara? (Sim/Não)")
                    && perguntaGeral("Seu escritor foi um poeta? (Sim/Não)");
        }

        private boolean perguntaGuimaraesRosa() {
            return perguntaGeral("Seu escritor fez parte do movimento literário 'Pós-modernismo'? (Sim/Não)")
                    && perguntaGeral("É dito que seu escritor escreveu 'uma das três epopeias da língua portuguesa'? (Sim/Não)");
        }

        private boolean perguntaMarioAndrade() {
            return perguntaGeral("Seu escritor foi músico? (Sim/Não)")
                    && perguntaGeral("Seu escritor trabalhou a música folclórica brasileira? (Sim/Não)")
                    && perguntaGeral("Seu escritor escreveu sobre um personagem indígena? (Sim/Não)");
        }

        private boolean perguntaCastroAlves() {
            return perguntaGeral("Seu escritor foi parte da escola do Romantismo? (Sim/Não)")
                    && perguntaGeral("Seu escritor era Baiano? (Sim/Não)")
                    && perguntaGeral("Seu escritor morou em Salvador? (Sim/Não)");
        }

        private boolean perguntaCoraCoralina() {
            return perguntaGeral("Ela é reconhecida por escrever sobre o cotidiano e a cultura popular? (Sim/Não)")
                    && perguntaGeral("Sua escritora teve uma carreira literária tardia? (Sim/Não)");
        }

        private boolean perguntaLygiaFagundesTelles() {
            return perguntaGeral("Sua escritora é conhecida por sua contribuição para a literatura contemporânea brasileira? (Sim/Não)")
                    && perguntaGeral("Ela é considerada uma das principais representantes do conto na literatura nacional? (Sim/Não)")
                    && perguntaGeral("Sua escritora já recebeu importantes prêmios literários, como o Prêmio Camões? (Sim/Não)")
                    && perguntaGeral("Ela pertenceu ao movimento literário do 'Modernismo'? (Sim/Não)")
                    && perguntaGeral("Sua escritora é reconhecida por sua prosa intimista e sensível? (Sim/Não)");
        }

        private boolean perguntaCeciliaMeireles() {
            return perguntaGeral("Sua escritora fez parte do movimento literário 'Parnasianismo'? (Sim/Não)")
                    && perguntaGeral("Sua escritora escreveu poemas? (Sim/Não)");
        }

        private boolean perguntaClariceLispector() {
            return perguntaGeral("Sua escritora teve filhos? (Sim/Não)")
                    && perguntaGeral("Sua escritora escreveu romances? (Sim/Não)")
                    && perguntaGeral("Sua escritora era judia? (Sim/Não)");
        }

        private boolean perguntaHildaHilst() {
            return perguntaGeral("Sua escritora nasceu em São Paulo? (Sim/Não)")
                    && perguntaGeral("Ela foi conhecida por escrever principalmente poesia? (Sim/Não)")
                    && perguntaGeral("Sua escritora também escreveu peças de teatro? (Sim/Não)")
                    && perguntaGeral("Ela é reconhecida por explorar temas de natureza erótica em sua obra? (Sim/Não)");
        }

        private boolean perguntaConceicaoEvaristo() {
            return perguntaGeral("Sua escritora nasceu em Minas Gerais? (Sim/Não)")
                    && perguntaGeral("Ela é conhecida por abordar temas relacionados à cultura afro-brasileira em sua obra? (Sim/Não)")
                    && perguntaGeral("Sua escritora já recebeu importantes prêmios literários, como o Prêmio Jabuti? (Sim/Não)")
                    && perguntaGeral("Ela é considerada uma das vozes mais importantes da literatura contemporânea brasileira? (Sim/Não)")
                    && perguntaGeral("Sua escritora também é conhecida por sua atuação no campo da educação e na promoção da igualdade racial? (Sim/Não)");
        }

        private void naoEncontrado() {
            JOptionPane.showMessageDialog(this, "Não foi possível adivinhar o escritor. Por favor, tente novamente.");
        }
    }
}