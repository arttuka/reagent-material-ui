(ns reagent-material-ui.icons.view-agenda-sharp
  "Imports @material-ui/icons/ViewAgendaSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-agenda-sharp (create-svg-icon (e "path" #js {"d" "M21 13H2v8h19v-8zm0-10H2v8h19V3z"})
                                        "ViewAgendaSharp"))
