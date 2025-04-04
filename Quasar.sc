Star "Thais C the Forbidden One"
{
    Class "Quasar"              // Classe correta para evitar confusão
    RA 03h00m00s
    Dec -45°00'00"
    Distance 2500000000         // 2.5 bilhões de anos-luz
    Mass 6.0e9                  // 6 bilhões de massas solares
    Radius 1.77e10              // Corrigido para o raio de Schwarzschild correto (km)
    Luminosity 1.5e8            // 150 milhões de luminosidades solares
    Temperature 1500000         // 1.5 milhão de Kelvin
    RotationPeriod 0.9          // Reduzido para evitar bugs no reconhecimento
    AppMag -27.3                // Magnitude absoluta visível

    AccretionDisk
    {
        InnerRadius 1.1         // Maior que o horizonte de eventos para evitar bugs
        OuterRadius 1000.0      // Ajustado para um quasar supermassivo
        Thickness 1.0
        Color [0.95, 0.5, 0.2]
        Opacity 0.95
        Brightness 5.0
        Texture "accretion_disk.jpg"
        Glow true
        InnerHotspot true

        RotationSpeed 0.3
        RotationDirection "Clockwise"
        Animated true
        Flicker true
        FlickerFrequency 0.05
        FlickerIntensity 1.2
    }

    GravLens 3.5                // Mantido para forte lente gravitacional
    LensFlare true
    LensFlareSize 4.0

    Jets
    {
        Length 10000            // Estendido para um quasar realista
        Width 200
        Color [0.3, 0.5, 0.9]
        Opacity 0.7
        Brightness 2.5
        Curvature 10.0
        Speed 0.98              // Mais próximo da velocidade da luz
        Angle 15.0
    }

    ParticleSystem
    {
        Type "Quasar"
        Density 1000
        Size 500
        Speed 0.95
    }

    Catalog "Custom"
    ID "THC-0001"
    Discoverer "Bee"
    Date "2024"

    Redshift 3.2
    SpectralType "QSO"
    Variability 0.15
    XRayLuminosity 1.0e40
    GammaRayLuminosity 5.0e39
    RadioLuminosity 2.0e37
    OpticalLuminosity 1.0e38
    IRLuminosity 4.0e38
    BolometricLuminosity 2.5e40
    EddingtonRatio 0.8
    DistanceModulus 47.2
    JetPower 1.5e46
    MassAccretionRate 1.0e2
    MagneticFieldStrength 1.0e4
    SpinParameter 0.9              // Reduzido para evitar classificação errada
    EventHorizonRadius 1.77e10     // Corrigido para um buraco negro supermassivo
    SchwarzschildRadius 1.77e10
    TidalDisruptionRadius 1.0e6
    RotationKerrParameter 0.95     // Ajustado para evitar bugs
    AccretionEfficiency 0.1

    XRaySpectrum
    {
        PeakEnergy 1.0e3
        SpectralIndex -1.5
    }

    UVLuminosity 2.0e38
    VisibleLuminosity 1.2e38

    RadioSpectralIndex -0.7
    RadioFluxDensity 5.0e-3

    CosmicDistanceModulus 47.2
    HubbleRedshift 0.015

    OrbitalSpeed 0.95c
    OrbitalPeriod 1.0e7

    VisualMagnitude -27.3
    ApparentMagnitude -30.0
    AppMagInstruments "Hubble"
}

