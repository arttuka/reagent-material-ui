(ns reagent-material-ui.icons.fast-forward-two-tone
  "Imports @material-ui/icons/FastForwardTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fast-forward-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 9.86v4.28L18.03 12zm-9 0v4.28L9.03 12z", "opacity" ".3"}) (e "path" #js {"d" "M4 18l8.5-6L4 6v12zm2-8.14L9.03 12 6 14.14V9.86zM21.5 12L13 6v12l8.5-6zM15 9.86L18.03 12 15 14.14V9.86z"}))
                                            "FastForwardTwoTone"))
