(ns reagent-mui.icons.tungsten
  "Imports @mui/icons-material/Tungsten as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tungsten (create-svg-icon (e "path" #js {"d" "M11 19h2v3h-2zm-9-8h3v2H2zm17 0h3v2h-3zm-3.106 6.8014 1.4072-1.4071 2.1213 2.1213-1.4071 1.4071zm-11.3099.7071 2.1214-2.1213 1.4071 1.4072-2.1213 2.1213zM15 8.02V3H9v5.02c-1.21.92-2 2.35-2 3.98 0 2.76 2.24 5 5 5s5-2.24 5-5c0-1.63-.79-3.06-2-3.98zM11 5h2v2.1c-.32-.06-.66-.1-1-.1s-.68.04-1 .1V5z"})
                               "Tungsten"))
