package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.event.PopupMenuListener;

import model.Temperaturas;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.ImageIcon;

public class ViewTemperatura {

	private JFrame frame;
	private JTextField txtValorParaConversao;
	private JTextField txtTemperaturaConvertida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTemperatura window = new ViewTemperatura();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewTemperatura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 494, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Imagem de termometro
		JLabel lblImagem = new JLabel("");
		lblImagem.setBounds(32, 89, 110, 115);
		ImageIcon iconOriginal = new ImageIcon(getClass().getResource("/image/temperatura-alta.png"));
		Image imgRedimensionada = iconOriginal.getImage().getScaledInstance( // Redimensionar para o tamanho do JLabel
				lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_SMOOTH);

		lblImagem.setIcon(new ImageIcon(imgRedimensionada)); // Setar a imagem redimensionada
		frame.getContentPane().add(lblImagem);

		// Texto que informamos o valor a ser convertido
		JLabel lblValorParaConversao = new JLabel("Valor para conversão:");
		lblValorParaConversao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorParaConversao.setBounds(51, 47, 134, 14);
		frame.getContentPane().add(lblValorParaConversao);

		txtValorParaConversao = new JTextField();
		txtValorParaConversao.setBounds(195, 46, 254, 20);
		frame.getContentPane().add(txtValorParaConversao);
		txtValorParaConversao.setColumns(10);

		JLabel lblNewLabel = new JLabel("De:");
		lblNewLabel.setBounds(159, 89, 26, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPara = new JLabel("Para:");
		lblPara.setBounds(152, 127, 33, 14);
		frame.getContentPane().add(lblPara);

		// Texto que exibe temperatura convertida
		JLabel lblTemperaturaConvertida = new JLabel("Temperatura convertida:");
		lblTemperaturaConvertida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemperaturaConvertida.setBounds(32, 250, 153, 14);
		frame.getContentPane().add(lblTemperaturaConvertida);

		txtTemperaturaConvertida = new JTextField();
		txtTemperaturaConvertida.setColumns(10);
		txtTemperaturaConvertida.setBounds(195, 249, 254, 20);
		frame.getContentPane().add(txtTemperaturaConvertida);

		// Caixa de seleção de temperatura de qual queremos
		JComboBox<String> comboBoxDe = new JComboBox<>();
		comboBoxDe.setModel(
				new DefaultComboBoxModel<>(new String[] { "Escolha o tipo de conversão", "Celsius", "Fahrenheit" }));
		comboBoxDe.addPopupMenuListener(new PopupMenuListener() { // Parte que deixa o texto de escolher conversão
																	// escondido
			@Override
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				if (comboBoxDe.getItemAt(0).equals("Escolha o tipo de conversão")) {
					comboBoxDe.removeItemAt(0);
				}
			}

			@Override
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}

			@Override
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
		});
		comboBoxDe.setBounds(195, 85, 254, 22);
		frame.getContentPane().add(comboBoxDe);

		// Caixa de seleção de temperatura para a qual queremos
		JComboBox<String> comboBoxPara = new JComboBox<>();
		comboBoxPara.setModel(
				new DefaultComboBoxModel<>(new String[] { "Escolha o tipo de conversão", "Celsius", "Fahrenheit" }));
		comboBoxPara.addPopupMenuListener(new PopupMenuListener() { // Parte que deixa o texto de escolher conversão
																	// escondido
			@Override
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
				if (comboBoxPara.getItemAt(0).equals("Escolha o tipo de conversão")) {
					comboBoxPara.removeItemAt(0);
				}
			}

			@Override
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			}

			@Override
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
		});
		comboBoxPara.setBounds(195, 123, 254, 22);
		frame.getContentPane().add(comboBoxPara);

		// Botão que dispara a ação de calcular
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!comboBoxDe.getSelectedItem().equals("Escolha o tipo de conversão")
						&& !comboBoxPara.getSelectedItem().equals("Escolha o tipo de conversão")) {
					if (comboBoxDe.getSelectedItem().equals("Celsius")
							&& comboBoxPara.getSelectedItem().equals("Fahrenheit")) {
						String resultado = Temperaturas.calcularCelsiusParaFahrenheit(txtValorParaConversao.getText());
						if (resultado != null) {
							txtTemperaturaConvertida.setText(resultado);
						} else {
							JOptionPane.showMessageDialog(null, "Erro: digite um valor válido.");
						}
					} else if (comboBoxDe.getSelectedItem().equals("Fahrenheit")
							&& comboBoxPara.getSelectedItem().equals("Celsius")) {
						String resultado = Temperaturas.calcularFahrenheitParaCelsius(txtValorParaConversao.getText());
						if (resultado != null) {
							txtTemperaturaConvertida.setText(resultado);
						} else {
							JOptionPane.showMessageDialog(null, "Erro: digite um valor válido.");
						}
					} else {
						txtTemperaturaConvertida.setText(txtValorParaConversao.getText());
					}
				}
			}
		});
		btnCalcular.setBounds(325, 180, 89, 23);
		frame.getContentPane().add(btnCalcular);

		// Botão que limpa as opções
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!comboBoxPara.getItemAt(0).equals("Escolha o tipo de conversão")
						&& !comboBoxDe.getItemAt(0).equals("Escolha o tipo de conversão")) {
					comboBoxDe.insertItemAt("Escolha o tipo de conversão", 0);
					comboBoxPara.insertItemAt("Escolha o tipo de conversão", 0);
					comboBoxDe.setSelectedIndex(0);
					comboBoxPara.setSelectedIndex(0);
				}
				txtTemperaturaConvertida.setText("");
				txtValorParaConversao.setText("");

			}
		});
		btnLimpar.setBounds(226, 180, 89, 23);
		frame.getContentPane().add(btnLimpar);

	}
}
