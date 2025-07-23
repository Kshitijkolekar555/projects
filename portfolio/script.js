// AOS animation
AOS.init();

// tsParticles background
tsParticles.load("tsparticles", {
  background: {
    color: "#0f172a"
  },
  fpsLimit: 60,
  interactivity: {
    events: {
      onHover: { enable: true, mode: "repulse" },
      resize: true
    },
    modes: {
      repulse: { distance: 100, duration: 0.4 }
    }
  },
  particles: {
    color: { value: "#38bdf8" },
    links: {
      enable: true,
      color: "#38bdf8",
      distance: 150
    },
    move: {
      enable: true,
      speed: 1.5
    },
    number: {
      value: 60
    },
    opacity: {
      value: 0.5
    },
    size: {
      value: 2.5
    }
  },
  detectRetina: true
});
