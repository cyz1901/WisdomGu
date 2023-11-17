<h1 align="center">
  <br>
  <img height="300" src="https://github.com/cyz1901/WisdomGu/blob/main/public/welcome.png?raw=true"> <br>
    Wisdom Gu
<br>
</h1>

[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.13.0.svg)](https://www.scala-js.org)
![Calico](https://img.shields.io/badge/calico-0.2.1-blue)
![CatsEffect](https://img.shields.io/badge/CatsEffect-3.5.2-blue)
![Tauri](https://img.shields.io/badge/Tauri-2.0.0-blue?logo=tauri)

# Wisdom Gu - Next Generation Knowledge Base

Wisdom Gu is a cutting-edge knowledge base built with Scala.js and Tauri.

## Introduction

Wisdom Gu represents the next evolution in knowledge management, combining the power of Scala.js for frontend development and Tauri for building lightweight and efficient desktop applications.

### Features

- **Modern Technology Stack**: Wisdom Gu leverages the capabilities of Scala.js, a modern programming language for building web applications, to ensure a robust and maintainable codebase.

- **Desktop Integration with Tauri**: The integration of Tauri allows Wisdom Gu to provide a seamless desktop experience, combining the flexibility of web technologies with the performance of native applications.

- **Intuitive User Interface**: The user interface is designed with user experience in mind, offering an intuitive and visually appealing design for efficient knowledge navigation and retrieval.

## Getting Started

### Prerequisites

Before setting up Wisdom Gu, ensure you have the following components installed:

- **Node.js**: Wisdom Gu frontend relies on [Node.js](https://nodejs.org/en) for package management and building. Ensure you have Node.js installed on your machine.

- **Scala Enviorment**: The frontend utilizes [Scala.js](https://www.scala-js.org/) to compile [Scala](https://www.scala-lang.org/) code into JavaScript and interacts with the backend written in Scala.Ensure your Scala development environment is set up properly.

Then you can get started with Wisdom Gu:

1. **Clone the Repository**:
   ```bash
   git clone git@github.com:cyz1901/WisdomGu.git
   ```

### Frontend Setup

Follow these steps to get started with Wisdom Gu frontend:

1. **Install Dependencies**:
   ```bash
   pnpm install
   ```

2. **Start SBT, transform TypeScript into Scala dependencies and enable compilation monitoring**:
   ```bash
   sbt ~frontend/fastLinkJS
   ```

3. **Open another terminal and start Vite**
   ```
   pnpm run dev
   ```

## Feedback and Support

If you encounter any issues or have suggestions for improvement, please open an issue on the [GitHub repository](https://github.com/cyz1901/WisdomGu/issues).

For general support and discussions, join our [community](https://github.com/cyz1901/WisdomGu/discussions).

## License

Wisdom Gu is released under the [APGL License](LICENSE).

---

Thank you for choosing Wisdom Gu! We hope it becomes your go-to platform for organizing and accessing knowledge in a modern and efficient way.