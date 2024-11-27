-- Populando a tabela de edificações
INSERT INTO edificacoes (nome, endereco, tipo, status) VALUES
('BS Tower Multi Office', 'R. Gonçalves Lêdo, 777', 'Edifício Comercial', 'OK'),
('Green Valley Residencial', 'Av. das Palmeiras, 45', 'Condomínio Residencial', 'OK'),
('TechHub Center', 'R. Inovação, 123', 'Centro Tecnológico', 'Manutenção'),
('Sunrise Plaza', 'Praça do Sol, 99', 'Shopping Center', 'OK');

-- Populando a tabela de sensores para BS Tower Multi Office
INSERT INTO sensores (id_edificacao, nome, tipo_sensor, valor_atual, unidade) VALUES
(1, 'Sensor do Hall de Entrada', 'Temperatura', '23.5', '°C'),
(1, 'Sensor do Hall de Entrada', 'Umidade', '45.2', '%'),
(1, 'Sensor do Escritório 101', 'Nível de CO2', '412', 'ppm'),
(1, 'Sensor do Escritório 102', 'Luminosidade', '320', 'lux');

-- Populando a tabela de sensores para Green Valley Residencial
INSERT INTO sensores (id_edificacao, nome, tipo_sensor, valor_atual, unidade) VALUES
(2, 'Sensor da Sala Comum', 'Temperatura', '22.1', '°C'),
(2, 'Sensor da Sala Comum', 'Umidade', '40.5', '%'),
(2, 'Sensor do Corredor', 'Presença', '1', 'Boolean'),
(2, 'Sensor da Cozinha', 'Vazamento de Gás', '0', 'Boolean'),
(2, 'Sensor do Playground', 'Qualidade do Ar', 'Bom', 'Índice'),
(2, 'Sensor do Playground', 'Ruído', '30', 'dB');

-- Populando a tabela de sensores para TechHub Center
INSERT INTO sensores (id_edificacao, nome, tipo_sensor, valor_atual, unidade) VALUES
(3, 'Sensor do Laboratório A', 'Temperatura', '25.3', '°C'),
(3, 'Sensor do Laboratório A', 'Nível de CO2', '600', 'ppm'),
(3, 'Sensor da Sala de Servidores', 'Consumo de Energia', '120', 'kWh'),
(3, 'Sensor do Laboratório B', 'Vibração', '2.5', 'Hz'),
(3, 'Sensor do Hall Principal', 'Luminosidade', '150', 'lux'),
(3, 'Sensor do Laboratório B', 'Umidade', '38', '%'),
(3, 'Sensor do Hall Principal', 'Ruído', '70', 'dB');

-- Populando a tabela de sensores para Sunrise Plaza
INSERT INTO sensores (id_edificacao, nome, tipo_sensor, valor_atual, unidade) VALUES
(4, 'Sensor do Estacionamento', 'Temperatura', '24.8', '°C'),
(4, 'Sensor do Estacionamento', 'Consumo de Água', '500', 'litros'),
(4, 'Sensor da Praça de Alimentação', 'Consumo de Energia', '220', 'kWh'),
(4, 'Sensor da Praça de Alimentação', 'Vazamento de Gás', '0', 'Boolean'),
(4, 'Sensor do Corredor Leste', 'Presença', '1', 'Boolean'),
(4, 'Sensor do Corredor Leste', 'Qualidade do Ar', 'Regular', 'Índice'),
(4, 'Sensor do Hall Principal', 'Nível de CO2', '520', 'ppm'),
(4, 'Sensor do Hall Principal', 'Luminosidade', '450', 'lux');
