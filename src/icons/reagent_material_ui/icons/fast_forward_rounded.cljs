(ns reagent-material-ui.icons.fast-forward-rounded
  "Imports @material-ui/icons/FastForwardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fast-forward-rounded (create-svg-icon (e "path" #js {"d" "M4.55 16.96l6.2-4.13c.59-.4.59-1.27 0-1.66l-6.2-4.13C3.89 6.59 3 7.07 3 7.87v8.26c0 .8.89 1.28 1.55.83zM13 7.87v8.26c0 .8.89 1.28 1.55.83l6.2-4.13c.59-.4.59-1.27 0-1.66l-6.2-4.13c-.66-.45-1.55.03-1.55.83z"})
                                           "FastForwardRounded"))
