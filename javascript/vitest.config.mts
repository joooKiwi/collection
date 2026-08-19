//··························································
// Copyright (c) 2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import {defineConfig} from 'vitest/config'

export default defineConfig({
    test: {
        dir: "./test",
        setupFiles: ["./test/setup-tests.ts",],
        coverage: {
            provider: "v8",
            reportsDirectory: "coverage",
            reporter: ["text", "json", "html",],
            include: ["src/**/*.{ts,tsx}",],
            exclude: [],
        },
    },
},)
