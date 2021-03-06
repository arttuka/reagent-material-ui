(ns reagent-material-ui.icons.subdirectory-arrow-left-rounded
  "Imports @material-ui/icons/SubdirectoryArrowLeftRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subdirectory-arrow-left-rounded (create-svg-icon (e "path" #js {"d" "M4.71 15.71L8.3 19.3c.62.62 1.7.18 1.7-.71V16h7c1.1 0 2-.9 2-2V5c0-.55-.45-1-1-1s-1 .45-1 1v9h-7v-2.59c0-.89-1.08-1.34-1.71-.71L4.7 14.29c-.38.39-.38 1.03.01 1.42z"})
                                                      "SubdirectoryArrowLeftRounded"))
