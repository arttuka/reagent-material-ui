(ns reagent-material-ui.icons.sailing-outlined
  "Imports @material-ui/icons/SailingOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sailing-outlined (create-svg-icon (e "path" #js {"d" "M11 13.5V2L3 13.5h8zm-2-2H6.83L9 8.38v3.12zm12 2C21 6.5 14.5 1 12.5 1c0 0 1 3 1 6.5s-1 6-1 6H21zm-5.62-8.26c1.42 1.52 2.88 3.72 3.41 6.26h-3.68c.21-1.1.39-2.46.39-4 0-.79-.05-1.55-.12-2.26zM22 15H2c.31 1.53 1.16 2.84 2.33 3.73.65-.27 1.22-.72 1.67-1.23.73.84 1.8 1.5 3 1.5s2.27-.66 3-1.5c.73.84 1.8 1.5 3 1.5s2.26-.66 3-1.5c.45.51 1.02.96 1.67 1.23 1.17-.89 2.02-2.2 2.33-3.73zm0 8v-2h-1c-1.04 0-2.08-.35-3-1-1.83 1.3-4.17 1.3-6 0-1.83 1.3-4.17 1.3-6 0-.91.65-1.96 1-3 1H2v2h1c1.03 0 2.05-.25 3-.75 1.89 1 4.11 1 6 0 1.89 1 4.11 1 6 0 .95.5 1.97.75 3 .75h1z"})
                                       "SailingOutlined"))
