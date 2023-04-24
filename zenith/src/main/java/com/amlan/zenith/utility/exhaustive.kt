package com.amlan.zenith.utility

/**
 *
 *    enum class Direction {
 *      NORTH, EAST, SOUTH, WEST
 *     }
 *     when (direction) {
 *          Direction.NORTH -> move(0, -1)
 *          Direction.EAST -> move(1, 0)
 *          Direction.WEST -> move(-1, 0)
 *       // no branch for Direction.SOUTH
 *       }.exhaustive
 *
 */
val <T> T.exhaustive: T
    get() = this
