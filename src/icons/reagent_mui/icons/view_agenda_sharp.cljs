(ns reagent-mui.icons.view-agenda-sharp
  "Imports @mui/icons-material/ViewAgendaSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-agenda-sharp (create-svg-icon (e "path" #js {"d" "M21 13H2v8h19v-8zm0-10H2v8h19V3z"})
                                        "ViewAgendaSharp"))
