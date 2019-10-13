(ns reagent-material-ui.icons.screen-lock-rotation-rounded
  "Imports @material-ui/icons/ScreenLockRotationRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def screen-lock-rotation-rounded (create-svg-icon (e "path" #js {"d" "M22.3 13.77l-1.86-1.87a.9959.9959 0 00-1.41 0c-.39.39-.39 1.02 0 1.41l1.51 1.52-5.66 5.66L3.56 9.17l5.66-5.66 1.4 1.4c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-1.75-1.75c-.59-.59-1.54-.59-2.12 0L1.8 8.11c-.59.59-.59 1.54 0 2.12l12.02 12.02c.59.59 1.54.59 2.12 0l6.36-6.36c.59-.59.59-1.54 0-2.12zM15.05 10h5c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1v-.5c0-1.38-1.12-2.5-2.5-2.5s-2.5 1.12-2.5 2.5V4c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1zm.8-6.5c0-.94.76-1.7 1.7-1.7s1.7.76 1.7 1.7V4h-3.4v-.5zm-7 16.65l-1.33 1.33c-3.09-1.46-5.34-4.37-5.89-7.86-.06-.41-.44-.69-.86-.62-.41.06-.69.45-.62.86.6 3.81 2.96 7.01 6.24 8.75 1.57.83 3.55 1.43 5.8 1.38.18 0 .26-.22.14-.35l-3.48-3.49z"})
                                                   "ScreenLockRotationRounded"))
