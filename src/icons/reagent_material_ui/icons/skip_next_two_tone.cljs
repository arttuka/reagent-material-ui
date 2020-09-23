(ns reagent-material-ui.icons.skip-next-two-tone
  "Imports @material-ui/icons/SkipNextTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-next-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 9.86v4.28L11.03 12z", "opacity" ".3"}) (e "path" #js {"d" "M14.5 12L6 6v12l8.5-6zM8 9.86L11.03 12 8 14.14V9.86zM16 6h2v12h-2z"}))
                                         "SkipNextTwoTone"))
