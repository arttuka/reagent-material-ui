(ns reagent-mui.icons.edit-road-rounded
  "Imports @mui/icons-material/EditRoadRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edit-road-rounded (create-svg-icon (e "path" #js {"d" "M17 4c-.55 0-1 .45-1 1v6.9l2-2V5c0-.55-.45-1-1-1zM5 20c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v14c0 .55.45 1 1 1zm6-12c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v2c0 .55.45 1 1 1zm0 6c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1s-1 .45-1 1v2c0 .55.45 1 1 1zm0 6c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1s-1 .45-1 1v2c0 .55.45 1 1 1zm11.56-7.41-1.15-1.15c-.59-.59-1.54-.59-2.12 0L14 16.73v2.77c0 .28.22.5.5.5h2.77l5.29-5.29c.59-.59.59-1.54 0-2.12zm-5.98 5.86h-1.03v-1.03L19 13.97 20.03 15l-3.45 3.45z"})
                                        "EditRoadRounded"))
