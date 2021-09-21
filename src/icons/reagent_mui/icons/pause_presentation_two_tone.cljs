(ns reagent-mui.icons.pause-presentation-two-tone
  "Imports @mui/icons-material/PausePresentationTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pause-presentation-two-tone (create-svg-icon [(e "path" #js {"d" "M3 19h18V5H3v14zM13 8h2v8h-2V8zM9 8h2v8H9V8z", "opacity" ".3"}) (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H3V5h18v14zM9 8h2v8H9zm4 0h2v8h-2z"})]
                                                  "PausePresentationTwoTone"))
