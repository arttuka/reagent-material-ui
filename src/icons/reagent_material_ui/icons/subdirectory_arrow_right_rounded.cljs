(ns reagent-material-ui.icons.subdirectory-arrow-right-rounded
  "Imports @material-ui/icons/SubdirectoryArrowRightRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subdirectory-arrow-right-rounded (create-svg-icon (e "path" #js {"d" "M19.71 15.71l-3.59 3.59c-.63.63-1.71.18-1.71-.71V16h-7c-1.1 0-2-.9-2-2V5c0-.55.45-1 1-1s1 .45 1 1v9h7v-2.59c0-.89 1.08-1.34 1.71-.71l3.59 3.59c.39.39.39 1.03 0 1.42z"})
                                                       "SubdirectoryArrowRightRounded"))
