(ns reagent-material-ui.icons.repeat-one-two-tone
  "Imports @material-ui/icons/RepeatOneTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def repeat-one-two-tone (create-svg-icon (e "path" #js {"d" "M13 15V9h-1l-2 1v1h1.5v4zm6-2h-2v4H7v-3l-4 4 4 4v-3h12zM17 2v3H5v6h2V7h10v3l4-4z"})
                                          "RepeatOneTwoTone"))
