(ns reagent-material-ui.icons.shower-two-tone
  "Imports @material-ui/icons/ShowerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shower-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 7c-2.76 0-5 2.24-5 5h10c0-2.76-2.24-5-5-5z", "opacity" ".3"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "16"}) (e "path" #js {"d" "M13 5.08V3h-2v2.08C7.61 5.57 5 8.47 5 12v2h14v-2c0-3.53-2.61-6.43-6-6.92zM7 12c0-2.76 2.24-5 5-5s5 2.24 5 5H7z"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "16"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "12"}))
                                      "ShowerTwoTone"))
