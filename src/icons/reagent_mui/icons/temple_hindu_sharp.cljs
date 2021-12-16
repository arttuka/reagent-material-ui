(ns reagent-mui.icons.temple-hindu-sharp
  "Imports @mui/icons-material/TempleHinduSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def temple-hindu-sharp (create-svg-icon (e "path" #js {"d" "M6.6 11h10.8l-.9-3h-9zM20 11v2H4v-2H2v11h8v-5h4v5h8V11zm-4.1-5L15 3V1h-2v2h-2.03V1h-2v2.12L8.1 6z"})
                                         "TempleHinduSharp"))
