Star "Thais C the Forbidden One"
{
    // Classificação de Quasar
    Class "QSO"                 // Classe Quasar
    RA 03h00m00s
    Dec -45°00'00"
    Distance 2500000000         // 2.5 bilhões de anos-luz
    Mass 6.0e9                  // 6 bilhões de massas solares (massa supermassiva de um quasar)
    Radius 1.78e12              // Raio do horizonte de eventos em km (Raio de Schwarzschild)
    Luminosity 1.5e8            // 150 milhões de luminosidades solares
    Temperature 1500000         // Temperatura de 1.5 milhão de Kelvin
    RotationPeriod 0.998        // Alta rotação (característica de quasars)
    AppMag -27.3                // Magnitude absoluta visível (extremamente brilhante)

    // Disco de Acreção Detalhado com Animação
    AccretionDisk
    {
        InnerRadius 0.8          // Horizonte de eventos interno
        OuterRadius 600.0        // Extensão máxima do disco
        Thickness 0.5
        Color [0.95, 0.5, 0.2]   // Cor laranja-avermelhada
        Opacity 0.95
        Brightness 4.0
        Texture "accretion_disk.jpg"
        Glow true
        InnerHotspot true

        // Animação para simular o movimento do disco de acreção
        RotationSpeed 0.2        // Velocidade de rotação do disco
        RotationDirection "Clockwise"  // Sentido horário
        Animated true            // Animação ativada
        Flicker true             // Faíscas e variação de brilho
        FlickerFrequency 0.05    // Frequência das faíscas
        FlickerIntensity 1.2     // Intensidade das faíscas
    }

    // Efeito de Lente Gravitacional
    GravLens 3.5                // Maior distorção gravitacional (efeito de lente gravitacional)
    LensFlare true
    LensFlareSize 4.0           // Tamanho do efeito de flare (reflexo luminoso)
    
    // Jatos Relativísticos
    Jets
    {
        Length 5000             // 5000 anos-luz de extensão
        Width 100
        Color [0.3, 0.5, 0.9]   // Cor dos jatos
        Opacity 0.7
        Brightness 2.5
        Curvature 15.0          // Curvatura dos jatos
        Speed 0.9               // Velocidade dos jatos relativísticos
        Angle 10.0              // Ângulo dos jatos
    }

    // Sistema de Partículas (representando a atividade do quasar)
    ParticleSystem
    {
        Type "Quasar"
        Density 500              // Alta densidade de partículas
        Size 300
        Speed 0.9
    }

    // Informações de Catalogação
    Catalog "Custom"
    ID "THC-0001"
    Discoverer "SeuNome"
    Date "2024"

    // Dados Científicos do Quasar
    Redshift 3.2               // Desvio para o vermelho (indicativo da distância e expansão do universo)
    SpectralType "QSO"         // Tipo espectral de Quasar
    Variability 0.15           // Variabilidade da luminosidade (alta variabilidade)
    XRayLuminosity 1.0e40      // Luminosidade em raios-X (erg/s)
    GammaRayLuminosity 5.0e39  // Luminosidade em raios gama (erg/s)
    RadioLuminosity 2.0e37     // Luminosidade em rádio (erg/s)
    OpticalLuminosity 1.0e38   // Luminosidade óptica (erg/s)
    IRLuminosity 4.0e38        // Luminosidade infravermelha (erg/s)
    BolometricLuminosity 2.5e40// Luminosidade bolométrica (erg/s)
    EddingtonRatio 0.8         // Razão de Eddington (indica a taxa de acreção em relação à luminosidade máxima)
    DistanceModulus 47.2       // Módulo de distância
    JetPower 1.5e46            // Potência dos jatos relativísticos (erg/s)
    MassAccretionRate 1.0e2    // Taxa de acreção (massas solares por ano)
    MagneticFieldStrength 1.0e4// Intensidade do campo magnético (Gauss)
    SpinParameter 0.9          // Parâmetro de spin (alta rotação)
    EventHorizonRadius 2.63e11 // Raio do horizonte de eventos (km)
    SchwarzschildRadius 2.63e11// Raio de Schwarzschild (km)
    TidalDisruptionRadius 1.0e6// Raio de disrupção de maré (km)
    RotationKerrParameter 0.99 // Parâmetro de rotação de Kerr (alta rotação)
    AccretionEfficiency 0.1    // Eficiência de acreção (fração da energia gerada)

    // Atividade de Radiação e Emissões
    XRaySpectrum
    {
        PeakEnergy 1.0e3         // Energia de pico em raios-X (eV)
        SpectralIndex -1.5       // Índice espectral para raios-X
    }

    UVLuminosity 2.0e38         // Luminosidade ultravioleta (erg/s)
    VisibleLuminosity 1.2e38    // Luminosidade visível (erg/s)

    // Parâmetros de Emissão em Ondas de Rádio
    RadioSpectralIndex -0.7    // Índice espectral para ondas de rádio
    RadioFluxDensity 5.0e-3    // Densidade de fluxo de rádio (Jy)

    // Parâmetros Cosmológicos
    CosmicDistanceModulus 47.2 // Módulo de distância cósmica
    HubbleRedshift 0.015       // Desvio para o vermelho cosmológico devido à expansão do universo

    // Dados Orbitais e Posição
    OrbitalSpeed 0.95c         // Velocidade orbital (próxima à velocidade da luz)
    OrbitalPeriod 1.0e7        // Período orbital (anos)

    // Dados de Imagem e Visualização
    VisualMagnitude -27.3      // Magnitude visual (muito brilhante)
    ApparentMagnitude -30.0    // Magnitude aparente (em telescópios potentes)
    AppMagInstruments "Hubble" // Telescópio usado para observação
}
