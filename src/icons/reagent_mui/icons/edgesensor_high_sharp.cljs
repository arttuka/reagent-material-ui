(ns reagent-mui.icons.edgesensor-high-sharp
  "Imports @mui/icons-material/EdgesensorHighSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edgesensor-high-sharp (create-svg-icon (e "path" #js {"d" "M3 7h2v7H3V7zm-3 3h2v7H0v-7zm22-3h2v7h-2V7zm-3 3h2v7h-2v-7zm-1-8H6v20h12V2zm-2 15H8V7h8v10z"})
                                            "EdgesensorHighSharp"))
