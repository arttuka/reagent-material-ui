(ns reagent-material-ui.icons.content-copy-two-tone
  "Imports @material-ui/icons/ContentCopyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def content-copy-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 7h11v14H8z", "opacity" ".3"}) (e "path" #js {"d" "M16 1H4c-1.1 0-2 .9-2 2v14h2V3h12V1zm3 4H8c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h11c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm0 16H8V7h11v14z"}))
                                            "ContentCopyTwoTone"))
