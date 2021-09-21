(ns reagent-mui.icons.store-mall-directory-two-tone
  "Imports @mui/icons-material/StoreMallDirectoryTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def store-mall-directory-two-tone (create-svg-icon [(e "path" #js {"d" "m5.64 9-.6 3h13.92l-.6-3z", "opacity" ".3"}) (e "path" #js {"d" "m4 7-1 5v2h1v6h10v-6h4v6h2v-6h1v-2l-1-5H4zm8 11H6v-4h6v4zm-6.96-6 .6-3h12.72l.6 3H5.04zM4 4h16v2H4z"})]
                                                    "StoreMallDirectoryTwoTone"))
