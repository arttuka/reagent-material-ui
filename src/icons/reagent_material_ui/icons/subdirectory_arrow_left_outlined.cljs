(ns reagent-material-ui.icons.subdirectory-arrow-left-outlined
  "Imports @material-ui/icons/SubdirectoryArrowLeftOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def subdirectory-arrow-left-outlined (create-svg-icon (e "path" #js {"d" "m11 9 1.42 1.42L8.83 14H18V4h2v12H8.83l3.59 3.58L11 21l-6-6 6-6z"})
                                                       "SubdirectoryArrowLeftOutlined"))
