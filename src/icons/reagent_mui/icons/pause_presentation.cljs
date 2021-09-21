(ns reagent-mui.icons.pause-presentation
  "Imports @mui/icons-material/PausePresentation as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pause-presentation (create-svg-icon [(e "path" #js {"d" "M21 19.1H3V5h18v14.1zM21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"}) (e "path" #js {"d" "M9 8h2v8H9zm4 0h2v8h-2z"})]
                                         "PausePresentation"))
