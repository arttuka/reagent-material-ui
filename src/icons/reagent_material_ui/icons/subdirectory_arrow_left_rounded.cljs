(ns reagent-material-ui.icons.subdirectory-arrow-left-rounded
  "Imports @material-ui/icons/SubdirectoryArrowLeftRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subdirectory-arrow-left-rounded (create-svg-icon (e "path" #js {"d" "M5.71 15.71l4.58 4.58c.39.39 1.03.39 1.42 0 .39-.39.39-1.03 0-1.42L8.83 16H19c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v9H8.83l2.88-2.87c.39-.39.39-1.03 0-1.42-.39-.39-1.03-.39-1.42 0l-4.58 4.58c-.39.39-.39 1.03 0 1.42z"})
                                                      "SubdirectoryArrowLeftRounded"))
