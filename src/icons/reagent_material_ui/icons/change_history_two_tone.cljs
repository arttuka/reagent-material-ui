(ns reagent-material-ui.icons.change-history-two-tone
  "Imports @material-ui/icons/ChangeHistoryTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def change-history-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 7.77L5.61 18h12.78z", "opacity" ".3"}) (e "path" #js {"d" "M12 4L2 20h20L12 4zm0 3.77L18.39 18H5.61L12 7.77z"}))
                                              "ChangeHistoryTwoTone"))
