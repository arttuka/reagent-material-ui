(ns reagent-material-ui.icons.content-copy-sharp
  "Imports @material-ui/icons/ContentCopySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def content-copy-sharp (create-svg-icon (e "path" #js {"d" "M16 1H2v16h2V3h12V1zm5 4H6v18h15V5zm-2 16H8V7h11v14z"})
                                         "ContentCopySharp"))
