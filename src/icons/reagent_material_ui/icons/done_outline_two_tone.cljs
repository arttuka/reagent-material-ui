(ns reagent-material-ui.icons.done-outline-two-tone
  "Imports @material-ui/icons/DoneOutlineTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def done-outline-two-tone (create-svg-icon (e "path" #js {"d" "M19.77 4.93l1.4 1.4L8.43 19.07l-5.6-5.6 1.4-1.4 4.2 4.2L19.77 4.93m0-2.83L8.43 13.44l-4.2-4.2L0 13.47l8.43 8.43L24 6.33 19.77 2.1z"})
                                            "DoneOutlineTwoTone"))
