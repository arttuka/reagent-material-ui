(ns reagent-material-ui.icons.moving
  "Imports @material-ui/icons/Moving as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def moving (create-svg-icon (e "path" #js {"d" "M19.71 9.71L22 12V6h-6l2.29 2.29-4.17 4.17c-.39.39-1.02.39-1.41 0l-1.17-1.17c-1.17-1.17-3.07-1.17-4.24 0L2 16.59 3.41 18l5.29-5.29c.39-.39 1.02-.39 1.41 0l1.17 1.17c1.17 1.17 3.07 1.17 4.24 0l4.19-4.17z"})
                             "Moving"))
