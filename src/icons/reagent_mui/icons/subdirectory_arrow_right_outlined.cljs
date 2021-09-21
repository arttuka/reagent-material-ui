(ns reagent-mui.icons.subdirectory-arrow-right-outlined
  "Imports @mui/icons-material/SubdirectoryArrowRightOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subdirectory-arrow-right-outlined (create-svg-icon (e "path" #js {"d" "m19 15-6 6-1.42-1.42L15.17 16H4V4h2v10h9.17l-3.59-3.58L13 9l6 6z"})
                                                        "SubdirectoryArrowRightOutlined"))
