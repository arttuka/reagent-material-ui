(ns reagent-mui.icons.watch-off-two-tone
  "Imports @mui/icons-material/WatchOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def watch-off-two-tone (create-svg-icon [(e "path" #js {"d" "M13.89 5.27 13.51 4h-3.02l-.38 1.27c1.82-.51 3.23-.16 3.78 0zm-3.78 13.46.38 1.27h3.02l.38-1.27c-1.82.51-3.23.16-3.78 0z", "opacity" ".3"}) (e "path" #js {"d" "M12 7c2.76 0 5 2.24 5 5 0 .64-.13 1.25-.35 1.82l1.5 1.5c.54-.99.85-2.12.85-3.32 0-2.22-1.03-4.19-2.64-5.47L15 2H9l-.96 3.21 2.14 2.14C10.75 7.13 11.36 7 12 7zm-1.51-3h3.02l.38 1.27c-.55-.16-1.97-.51-3.78 0L10.49 4zM2.81 2.81 1.39 4.22l4.46 4.46C5.31 9.67 5 10.8 5 12c0 2.22 1.03 4.19 2.64 5.47L9 22h6l.96-3.21 3.82 3.82 1.41-1.41L2.81 2.81zM13.51 20h-3.02l-.38-1.27c.55.15 1.97.51 3.78 0L13.51 20zM12 17c-2.76 0-5-2.24-5-5 0-.64.13-1.25.35-1.82l6.47 6.47c-.57.22-1.18.35-1.82.35z"})]
                                         "WatchOffTwoTone"))
