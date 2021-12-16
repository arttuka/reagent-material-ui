(ns reagent-mui.icons.view-agenda-sharp
  "Imports @mui/icons-material/ViewAgendaSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-agenda-sharp (create-svg-icon (e "path" #js {"d" "M3 13h18v8H3zM3 3h18v8H3z"})
                                        "ViewAgendaSharp"))
