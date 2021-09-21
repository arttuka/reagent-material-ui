(ns reagent-mui.icons.doorbell-sharp
  "Imports @mui/icons-material/DoorbellSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def doorbell-sharp (create-svg-icon (e "path" #js {"d" "M12 3 4 9v12h16V9l-8-6zm0 14.5c-.55 0-1-.45-1-1h2c0 .55-.45 1-1 1zm4-1.5H8v-1h1v-2.34c0-1.54.82-2.82 2.25-3.16v-1h1.5v1c1.44.34 2.25 1.62 2.25 3.16V15h1v1z"})
                                     "DoorbellSharp"))
