(ns reagent-mui.icons.crop-75-rounded
  "Imports @mui/icons-material/Crop75Rounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-75-rounded (create-svg-icon (e "path" #js {"d" "M19 7H5c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V9c0-1.1-.9-2-2-2zm-1 8H6c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1h12c.55 0 1 .45 1 1v4c0 .55-.45 1-1 1z"})
                                      "Crop75Rounded"))
