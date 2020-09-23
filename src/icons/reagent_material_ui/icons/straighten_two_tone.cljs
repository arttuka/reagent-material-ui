(ns reagent-material-ui.icons.straighten-two-tone
  "Imports @material-ui/icons/StraightenTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def straighten-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 12h-2V8h-2v4h-2V8h-2v4H9V8H7v4H5V8H3v8h18V8h-2z", "opacity" ".3"}) (e "path" #js {"d" "M21 6H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 10H3V8h2v4h2V8h2v4h2V8h2v4h2V8h2v4h2V8h2v8z"}))
                                          "StraightenTwoTone"))
