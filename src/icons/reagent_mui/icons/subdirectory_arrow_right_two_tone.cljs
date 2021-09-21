(ns reagent-mui.icons.subdirectory-arrow-right-two-tone
  "Imports @mui/icons-material/SubdirectoryArrowRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subdirectory-arrow-right-two-tone (create-svg-icon (e "path" #js {"d" "m19 15-6 6-1.42-1.42L15.17 16H4V4h2v10h9.17l-3.59-3.58L13 9l6 6z"})
                                                        "SubdirectoryArrowRightTwoTone"))
