(ns reagent-mui.icons.movie-filter-two-tone
  "Imports @mui/icons-material/MovieFilterTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def movie-filter-two-tone (create-svg-icon [(e "path" #js {"d" "M16.63 11.37 18 12l-1.37.63L16 14l-.63-1.37L14 12l1.37-.63L16 10H5.77L4.01 6.47V18h16v-8H16l.63 1.37zm-5.69 3.57L10 17l-.94-2.06L7 14l2.06-.94L10 11l.94 2.06L13 14l-2.06.94z", "opacity" ".3"}) (e "path" #js {"d" "m10 11-.94 2.06L7 14l2.06.94L10 17l.94-2.06L13 14l-2.06-.94zm8.01-7 2 4h-3l-2-4h-2l2 4h-3l-2-4h-2l2 4h-3l-2-4h-1c-1.1 0-1.99.9-1.99 2l-.01 12c0 1.1.9 2 2 2h16c1.1 0 1.99-.9 1.99-2V4h-3.99zm2 14h-16V6.47L5.77 10H16l-.63 1.37L14 12l1.37.63L16 14l.63-1.37L18 12l-1.37-.63L16 10h4.01v8z"})]
                                            "MovieFilterTwoTone"))
