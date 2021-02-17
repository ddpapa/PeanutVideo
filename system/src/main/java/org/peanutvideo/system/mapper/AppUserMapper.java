package org.peanutvideo.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.peanutvideo.system.domain.AppUser;

import java.util.List;

@Mapper
public interface AppUserMapper {
    /**
     *
     * @param id
     * @return
     */
    int deleteAppUser(Integer id);

    /**
     *
     * @param appUser
     * @return
     */
    int insertAppUser(AppUser appUser);

    /**
     *
     * @param id
     * @return
     */
    AppUser selectAppUserById(Integer id);

    /**
     *
     * @param appUser
     * @return
     */
    List<AppUser> selectAppUserList(AppUser appUser);

    /**
     *
     * @param appUser
     * @return
     */
    AppUser selectAppUser(AppUser appUser);

    /**
     *
     * @param appUser
     * @return
     */
    int selectAppUserCounter(AppUser appUser);

    /**
     *
     * @param appUser
     * @return
     */
    int updateAppUser(AppUser appUser);
}