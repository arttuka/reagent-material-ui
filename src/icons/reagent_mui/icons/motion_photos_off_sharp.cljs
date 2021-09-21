(ns reagent-mui.icons.motion-photos-off-sharp
  "Imports @mui/icons-material/MotionPhotosOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def motion-photos-off-sharp (create-svg-icon [(e "path" #js {"d" "M12 6c-.92 0-1.8.22-2.58.59l7.99 7.99c.37-.78.59-1.66.59-2.58 0-3.31-2.69-6-6-6zM2.81 2.81 1.39 4.22l2.27 2.27C2.61 8.07 2 9.96 2 12c0 5.52 4.48 10 10 10 2.04 0 3.93-.61 5.51-1.66l2.27 2.27 1.41-1.42L2.81 2.81zM12 20c-4.41 0-8-3.59-8-8 0-1.48.41-2.86 1.12-4.06l1.47 1.47C6.22 10.2 6 11.08 6 12c0 3.31 2.69 6 6 6 .92 0 1.8-.22 2.58-.59l1.47 1.47C14.86 19.59 13.48 20 12 20z"}) (e "path" #js {"d" "M12 4c4.41 0 8 3.59 8 8 0 1.48-.41 2.86-1.12 4.05l1.45 1.45C21.39 15.93 22 14.04 22 12c0-5.52-4.48-10-10-10-2.04 0-3.93.61-5.51 1.66l1.45 1.45C9.14 4.41 10.52 4 12 4z"})]
                                              "MotionPhotosOffSharp"))
