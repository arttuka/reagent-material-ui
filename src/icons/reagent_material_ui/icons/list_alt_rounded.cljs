(ns reagent-material-ui.icons.list-alt-rounded
  "Imports @material-ui/icons/ListAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def list-alt-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 9h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1z"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "12", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "16", "r" "1", "cx" "8"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}))
                                       "ListAltRounded"))
