(ns reagent-material-ui.icons.subdirectory-arrow-right-two-tone
  "Imports @material-ui/icons/SubdirectoryArrowRightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def subdirectory-arrow-right-two-tone (create-svg-icon (e "path" #js {"d" "M19 15l-6 6-1.42-1.42L15.17 16H4V4h2v10h9.17l-3.59-3.58L13 9l6 6z"})
                                                        "SubdirectoryArrowRightTwoTone"))
