(ns reagent-material-ui.icons.timer-off-rounded
  "Imports @material-ui/icons/TimerOffRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def timer-off-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7.85 5.02l1.51 1.51c1.56-.64 3.36-.79 5.29.01 1.71.71 3.1 2.1 3.8 3.81.79 1.93.64 3.73 0 5.28l1.51 1.51A8.734 8.734 0 0 0 21 13c0-2.12-.74-4.07-1.97-5.61l.72-.72c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-.72.72C16.07 4.74 14.12 4 12 4c-1.5 0-2.91.38-4.15 1.02zM14 1h-4c-.55 0-1 .45-1 1s.45 1 1 1h4c.55 0 1-.45 1-1s-.45-1-1-1zM2.1 3.51c-.39.39-.39 1.02 0 1.41l2.69 2.69c-1.4 1.87-2.1 4.29-1.67 6.89.61 3.74 3.63 6.75 7.37 7.37 2.6.43 5.02-.27 6.88-1.67l1.69 1.69c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51a.9959.9959 0 0 0-1.41 0zM12 20c-3.86 0-7-3.14-7-7 0-1.46.45-2.82 1.22-3.95l9.72 9.72C14.82 19.55 13.46 20 12 20z"}) (e "path" #js {"d" "M13 9c0-.55-.45-1-1-1-.32 0-.59.16-.78.4l1.6 1.6.18.17V9z"}))
                                        "TimerOffRounded"))
