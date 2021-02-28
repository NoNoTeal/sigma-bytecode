public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d {
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u385b\ud7e8\u71ae\u7043\uc3e3\u3776 \ub171\ub8be\u873d\u9033\u7330(java.lang.String p0, java.lang.String p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(invokestatic:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\ud217\u624e\u34df\u0b8e\u416d::\ub171\ub8be\u873d\u9033\u7330, initobject:\ud217\u624e\u34df\u0b8e\u416d(\ud217\u624e\u34df\u0b8e\u416d::<init>, p0:String, p1:String)))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u385b\ud7e8\u71ae\u7043\uc3e3\u3776 \ub171\ub8be\u873d\u9033\u7330(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d p0) {
        var_3_77 : String
        var_5_92 : YggdrasilUserAuthentication
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        
        if (logicalnot:boolean(invokevirtual:boolean(\ud217\u624e\u34df\u0b8e\u416d::\u93a2\ud12e\u71ae\uafe7\uc84e, p0:\ud217\u624e\u34df\u0b8e\u416d))) {
            var_3_77 = loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(8321), ldc:int(8323)))
            var_5_92 = initobject:YggdrasilUserAuthentication(YggdrasilUserAuthentication::<init>, initobject:YggdrasilAuthenticationService(YggdrasilAuthenticationService::<init>, getstatic:Proxy(Proxy::NO_PROXY), var_3_77:String), var_3_77:String, getstatic:Agent(Agent::MINECRAFT))
            invokevirtual:void(YggdrasilUserAuthentication::setUsername, var_5_92:YggdrasilUserAuthentication, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, p0:\ud217\u624e\u34df\u0b8e\u416d))
            invokevirtual:void(YggdrasilUserAuthentication::setPassword, var_5_92:YggdrasilUserAuthentication, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ud12e\u839e\ub8be\u5d20, p0:\ud217\u624e\u34df\u0b8e\u416d))
            invokevirtual:void(YggdrasilUserAuthentication::logIn, var_5_92:YggdrasilUserAuthentication)
            invokevirtual:void(\ud217\u624e\u34df\u0b8e\u416d::\ub8be\u16f6\u47c2\u71ae\u5bc4, p0:\ud217\u624e\u34df\u0b8e\u416d)
            return:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(initobject:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::<init>, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(YggdrasilUserAuthentication::getSelectedProfile, var_5_92:YggdrasilUserAuthentication)), invokevirtual:String(UUID::toString, invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(YggdrasilUserAuthentication::getSelectedProfile, var_5_92:YggdrasilUserAuthentication))), invokevirtual:String(YggdrasilUserAuthentication::getAuthenticatedToken, var_5_92:YggdrasilUserAuthentication), invokevirtual:String(Enum<E>::name, invokevirtual:\u8aa5\u516c\u64f2\uc229\u64f2\ucef1[expected:Enum<\u8aa5\u516c\u64f2\uc229\u64f2\ucef1>](\ud217\u624e\u34df\u0b8e\u416d::\u3d64\u99f7\u93a2\u5db4\ubb2b, p0:\ud217\u624e\u34df\u0b8e\u416d))))
        }
        
        return:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(initobject:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::<init>, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, p0:\ud217\u624e\u34df\u0b8e\u416d), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(15699), ldc:int(-15828))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(9673), ldc:int(-9674))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(16417), ldc:int(3073)))))
    }
    
    public void \ud217\u624e\u34df\u0b8e\u416d(java.lang.String p0, java.lang.String p1, java.util.ArrayList<\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5> p2, java.lang.String p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\ud217\u624e\u34df\u0b8e\u416d)
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(20577), ldc:int(20578))))
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u40a9\ud51e\ua562\ucef1\u873d, this:\ud217\u624e\u34df\u0b8e\u416d, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(-30687), ldc:int(-30683))))
            putfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d, initobject:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(ArrayList<E>::<init>))
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String)
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0b8e\ubf56\u946b\u71ae\u6b5f, this:\ud217\u624e\u34df\u0b8e\u416d, p1:String)
            putfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u9af2\u6c52\u6b0d\u6bb9\uc31c, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:long(System::currentTimeMillis))
            putfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u51fa\u7d52\ub102\uc2bd\u3e2a, this:\ud217\u624e\u34df\u0b8e\u416d, ldc:long(0L))
            putfield:int(\ud217\u624e\u34df\u0b8e\u416d::\u56bd\ub32d\u8aa5\u8350\u836c, this:\ud217\u624e\u34df\u0b8e\u416d, and:int(ldc:int(5761), ldc:int(-14018)))
            
            if (cmpne:boolean(p2:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>, aconstnull:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>())) {
                putfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d, p2:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>)
            }
            
            if (cmpne:boolean(p3:String, aconstnull:String())) {
                putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d, p3:String)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u624e\u34df\u0b8e\u416d(java.lang.String p0, java.lang.String p1, java.util.ArrayList<\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5> p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\ud217\u624e\u34df\u0b8e\u416d(\ud217\u624e\u34df\u0b8e\u416d::<init>, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String, p1:String, p2:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>, aconstnull:String())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u624e\u34df\u0b8e\u416d(java.lang.String p0, java.lang.String p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\ud217\u624e\u34df\u0b8e\u416d(\ud217\u624e\u34df\u0b8e\u416d::<init>, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String, p1:String, aconstnull:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(), aconstnull:String())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u624e\u34df\u0b8e\u416d(\u516c\u3d64\u718f\ub171\u6b5f.\uc910\ub6ab\uafe7\ud217\u7330\u600f p0) {
        var_4_125 : Iterator<Object>
        var_4_278 : byte[]
        var_5_299 : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\ud217\u624e\u34df\u0b8e\u416d)
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(4161), ldc:int(4162))))
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u40a9\ud51e\ua562\ucef1\u873d, this:\ud217\u624e\u34df\u0b8e\u416d, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(4325), ldc:int(24838))))
            putfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d, initobject:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(ArrayList<E>::<init>))
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(-28155), ldc:int(-28160))))) {
                putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(8197), ldc:int(6781)))))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(10894), ldc:int(38))))) {
                putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0b8e\ubf56\u946b\u71ae\u6b5f, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:String(\ud217\u624e\u34df\u0b8e\u416d::\u4e72\ub18d\u92ee\u93a2\ud12e, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(19462), ldc:int(4759))))))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(-28512), ldc:int(-28505))))) {
                var_4_125 = invokevirtual:Iterator<Object>(\u1833\ubff1\u960f\u516c\u4f52\u9a18::iterator, invokevirtual:\u1833\ubff1\u960f\u516c\u4f52\u9a18(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u7006\u7043\u36d3\uc2e8\ub18d\uae87, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(28687), ldc:int(583)))))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_125:Iterator<Object>)) {
                    invokevirtual:boolean(ArrayList<\u873d\uc229\u9033\u0800\uf9c5>::add, getfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d), initobject:\u873d\uc229\u9033\u0800\uf9c5(\u873d\uc229\u9033\u0800\uf9c5::<init>, checkcast:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\u516c\u3d64\u718f\ub171\u6b5f.\uc910\ub6ab\uafe7\ud217\u7330\u600f.class, invokeinterface:\uc910\ub6ab\uafe7\ud217\u7330\u600f(Iterator<\uc910\ub6ab\uafe7\ud217\u7330\u600f>::next, var_4_125:Iterator<\uc910\ub6ab\uafe7\ud217\u7330\u600f>))))
                }
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(5381), ldc:int(5389))))) {
                putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(12920), ldc:int(16392)))))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(2176), ldc:int(2185))))) {
                putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u40a9\ud51e\ua562\ucef1\u873d, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(4873), ldc:int(2185)))))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(17546), ldc:int(2670))))) {
                putfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u9af2\u6c52\u6b0d\u6bb9\uc31c, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:long(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ua61f\ubb2b\u8258\u836c\u47c2\u647c, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(597), ldc:int(607)))))
            }
            else {
                putfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u9af2\u6c52\u6b0d\u6bb9\uc31c, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:long(System::currentTimeMillis))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(8212), ldc:int(8223))))) {
                putfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u51fa\u7d52\ub102\uc2bd\u3e2a, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:long(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ua61f\ubb2b\u8258\u836c\u47c2\u647c, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(4104), ldc:int(4099)))))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(1540), ldc:int(1544))))) {
                putfield:int(\ud217\u624e\u34df\u0b8e\u416d::\u56bd\ub32d\u8aa5\u8350\u836c, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:int(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u64f2\ud51e\u5245\u3c25\u983f\u7ce1, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(5244), ldc:int(143)))))
            }
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(17424), ldc:int(17437))))) {
                var_4_278 = invokestatic:byte[](DatatypeConverter::parseBase64Binary, invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, p0:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(2477), ldc:int(29)))))
                
                try {
                    putfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:BufferedImage(ImageIO::read, initobject:ByteArrayInputStream(ByteArrayInputStream::<init>, var_4_278:byte[])))
                }
                catch (java.io.IOException var_5_299) {
                    invokevirtual:void(Throwable::printStackTrace, var_5_299:IOException[expected:Throwable])
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u16f6\u47c2\u71ae\u5bc4() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:int(\ud217\u624e\u34df\u0b8e\u416d::\u56bd\ub32d\u8aa5\u8350\u836c, this:\ud217\u624e\u34df\u0b8e\u416d, add:int(getfield:int(\ud217\u624e\u34df\u0b8e\u416d::\u56bd\ub32d\u8aa5\u8350\u836c, this:\ud217\u624e\u34df\u0b8e\u416d), and:int(ldc:int(2117), ldc:int(8473))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.ArrayList<\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5> \u3c25\ub70c\u5bc4\u8640\ubefe() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(getfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3711\ub113\u52d3\ubb2b\ub18d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u9937\u1187\u8308\u64ab\uc29a() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ub83f\uf995\u5245\u5bc4\u3e75() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d), loadelement:String[expected:Object](getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(2579), ldc:int(139)))))) {
            return:String(getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        return:String(getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d))
    }
    
    public java.lang.String \u983f\ua3b4\u0c95\u3c25\uc7fe() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u40a9\ud51e\ua562\ucef1\u873d, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u6c56\ud12e\u839e\ub8be\u5d20() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0b8e\ubf56\u946b\u71ae\u6b5f, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public void \u5245\u5bc4\u6198\uf9c5\uff55(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0b8e\ubf56\u946b\u71ae\u6b5f, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc246\u6fb0\u9af2\u88c5\u3e75(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u416d\u8aa5\u52d3\u7af6(\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\ud217\u624e\u34df\u0b8e\u416d::\u183a\u9937\u74b1\uceb8\u7873, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(\u873d\uc229\u9033\u0800\uf9c5::\ub6ab\u7ce1\ub6ab\u8258\u3a62, p0:\u873d\uc229\u9033\u0800\uf9c5))
            invokevirtual:boolean(ArrayList<\u873d\uc229\u9033\u0800\uf9c5>::add, getfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d), p0:\u873d\uc229\u9033\u0800\uf9c5)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u183a\u9937\u74b1\uceb8\u7873(java.lang.String p0) {
        var_2_61 : int
        var_4_69 : Iterator<\u873d\uc229\u9033\u0800\uf9c5>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(-1643983755), ldc:int(1332997317))
            var_4_69 = invokevirtual:Iterator<\u873d\uc229\u9033\u0800\uf9c5>(ArrayList<\u873d\uc229\u9033\u0800\uf9c5>::iterator, getfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(1239154277))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_69:Iterator<\u873d\uc229\u9033\u0800\uf9c5>))) {
                    looporswitchbreak()
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\u873d\uc229\u9033\u0800\uf9c5::\ub6ab\u7ce1\ub6ab\u8258\u3a62, checkcast:\u873d\uc229\u9033\u0800\uf9c5(\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5.class, invokeinterface:\u873d\uc229\u9033\u0800\uf9c5(Iterator<\u873d\uc229\u9033\u0800\uf9c5>::next, var_4_69:Iterator<\u873d\uc229\u9033\u0800\uf9c5>))), p0:String[expected:Object]))) {
                    loopcontinue()
                }
                
                invokeinterface:void(Iterator<E>::remove, var_4_69:Iterator<\u873d\uc229\u9033\u0800\uf9c5>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6435\u3e2a\u120d\u494c\u5d20(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String)
            putfield:Thread(\ud217\u624e\u34df\u0b8e\u416d::\uff55\u98a4\u34df\u98a4\u6cfe, this:\ud217\u624e\u34df\u0b8e\u416d, aconstnull:Thread())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\u69d9\ud7e8\u51fa\u8753(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u40a9\ud51e\ua562\ucef1\u873d, this:\ud217\u624e\u34df\u0b8e\u416d, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe \u965f\u4c04\u3504\uc246\ub102() {
        var_1_138 : int
        var_3_20E : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_138 = and:int(ldc:int(135171069), ldc:int(720080636))
        
        loop {
            Label_0098:
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0537)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0437)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0313)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(4)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(-41528536))
                goto(Label_0240)
            }
            
            if (cmpne:boolean(and:int(var_1_138:int, ldc:int(2097152)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(881104755))
            }
            else {
                var_1_138 = and:int(var_1_138:int, ldc:int(2041242605))
                
                if (cmpne:boolean(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ud217\u624e\u34df\u0b8e\u416d::\ud171\u416d\ub6ab\u9937\u8c8a, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                    goto(Label_0537)
                }
            }
            
            Label_0169:
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(128)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(1753562536))
                goto(Label_0537)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(128)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(-852148590))
                goto(Label_0437)
            }
            
            if (cmpne:boolean(and:int(var_1_138:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0313)
            }
            
            if (cmpne:boolean(and:int(var_1_138:int, ldc:int(32)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_138:int, ldc:int(65536)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_138 = and:int(var_1_138:int, ldc:int(802131957))
                
                if (cmpeq:boolean(getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:BufferedImage())) {
                    goto(Label_0537)
                }
            }
            
            Label_0240:
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(131072)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(830158323))
                goto(Label_0537)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(403133435))
                goto(Label_0437)
            }
            
            if (cmpne:boolean(and:int(var_1_138:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(32)), ldc:int(0))) {
                    var_1_138 = and:int(var_1_138:int, ldc:int(1052943683))
                    loopcontinue()
                }
                
                var_1_138 = and:int(var_1_138:int, ldc:int(2059115246))
            }
            
            try {
                Label_0313:
                
                while (cmpeq:boolean(and:int(var_1_138:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_138 = and:int(var_1_138:int, ldc:int(2082036433))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_138:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_138 = and:int(var_1_138:int, ldc:int(211508824))
                            goto(Label_0240)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_138 = and:int(var_1_138:int, ldc:int(69452607))
                            goto(Label_0169)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(64)), ldc:int(0))) {
                            var_1_138 = and:int(var_1_138:int, ldc:int(-1302545998))
                            loopcontinue(Label_0098)
                        }
                        
                        var_1_138 = and:int(var_1_138:int, ldc:int(-1955949578))
                        putfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ud217\u624e\u34df\u0b8e\u416d::\ud171\u416d\ub6ab\u9937\u8c8a, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5245\u7af6\u6bb9\u3e2a\u8bb0\uc7fe::\ud523\u4c2b\uc2bd\u97e6\ubff1\u759a, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(18445), ldc:int(5693))), invokevirtual:BufferedImage(BufferedImage::getSubimage, getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), ldc:int(8), ldc:int(8), ldc:int(8), ldc:int(8))))
                    }
                    
                    Label_0437:
                    
                    if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(4)), ldc:int(0))) {
                        var_1_138 = and:int(var_1_138:int, ldc:int(-771809559))
                        goto(Label_0537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_138 = and:int(var_1_138:int, ldc:int(-420883303))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_138:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_138 = and:int(var_1_138:int, ldc:int(-1445926066))
                            goto(Label_0240)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_138:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_138 = and:int(var_1_138:int, ldc:int(-793189864))
                            goto(Label_0169)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_138:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_138 = and:int(var_1_138:int, ldc:int(-577779986))
                            goto(Label_0537)
                        }
                        
                        loopcontinue(Label_0098)
                    }
                }
                
                var_1_138 = and:int(var_1_138:int, ldc:int(1756535391))
            }
            catch (java.io.IOException var_3_20E) {
                var_1_138 = and:int(var_1_138:int, ldc:int(676328164))
                invokevirtual:void(Throwable::printStackTrace, var_3_20E:IOException[expected:Throwable])
            }
            
            Label_0537:
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0437)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(512)), ldc:int(0))) {
                var_1_138 = and:int(var_1_138:int, ldc:int(-1341377151))
                goto(Label_0313)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0240)
            }
            
            if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0169)
            }
            
            if (cmpne:boolean(and:int(var_1_138:int, ldc:int(128)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_1_138 = and:int(var_1_138:int, ldc:int(1663893257))
        }
        
        if (cmpne:boolean(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ud217\u624e\u34df\u0b8e\u416d::\ud171\u416d\ub6ab\u9937\u8c8a, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
            return:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ud217\u624e\u34df\u0b8e\u416d::\ud171\u416d\ub6ab\u9937\u8c8a, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        return:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u873d\u9a18\u71ae\u36d3\u4975))
    }
    
    public void finalize() {
        var_1_124 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_124 = and:int(ldc:int(1779250724), ldc:int(1272656013))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_124 = and:int(var_1_124:int, ldc:int(-1953496092))
                        goto(Label_0211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_124 = and:int(var_1_124:int, ldc:int(1509105587))
                    }
                    else {
                        var_1_124 = and:int(var_1_124:int, ldc:int(1785684646))
                        
                        if (cmpeq:boolean(getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ud217\u624e\u34df\u0b8e\u416d::\ud171\u416d\ub6ab\u9937\u8c8a, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                            goto(Label_0211)
                        }
                    }
                    
                    Label_0153:
                    
                    if (cmpne:boolean(and:int(var_1_124:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_124 = and:int(var_1_124:int, ldc:int(1600227154))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_124 = and:int(var_1_124:int, ldc:int(887000482))
                            loopcontinue()
                        }
                        
                        var_1_124 = and:int(var_1_124:int, ldc:int(1251847084))
                        invokevirtual:void(\u6b0d\ua068\uc4d2\u5245\u4d85::\uff55\u3d4b\u946b\uf94d\u071d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c), getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\ud217\u624e\u34df\u0b8e\u416d::\ud171\u416d\ub6ab\u9937\u8c8a, this:\ud217\u624e\u34df\u0b8e\u416d))
                    }
                    
                    Label_0211:
                    
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_124 = and:int(var_1_124:int, ldc:int(1404487809))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_124:int, ldc:int(2097152)), ldc:int(0))) {
                            var_1_124 = and:int(var_1_124:int, ldc:int(2104249976))
                            goto(Label_0153)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_124 = and:int(var_1_124:int, ldc:int(1543466446))
                        invokespecial:void(Object::finalize, this:\ud217\u624e\u34df\u0b8e\u416d[expected:Object])
                    }
                    
                    Label_0263:
                    
                    if (cmpne:boolean(and:int(var_1_124:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_124:int, ldc:int(4194304)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_124 = and:int(var_1_124:int, ldc:int(1588410518))
            }
            finally {
                invokespecial:void(Object::finalize, this:\ud217\u624e\u34df\u0b8e\u416d[expected:Object])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.awt.image.BufferedImage \u9af2\uae5d\u873d\ubcb0\ud158() {
        var_1_61 : int
        var_3_91 : Rectangle
        var_4_B5 : Graphics2D
        var_5_102 : BufferedImage
        var_6_113 : BufferedImage
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-1951184434), ldc:int(-1344811109))
            
            if (cmpeq:boolean(getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\u8aa5\u3e2a\ucb79\u8cae\u3504, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:BufferedImage())) {
                if (cmpne:boolean(getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:BufferedImage())) {
                    var_3_91 = initobject:Rectangle(Rectangle::<init>, ldc:int(64), ldc:int(64))
                    putfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\u8aa5\u3e2a\ucb79\u8cae\u3504, this:\ud217\u624e\u34df\u0b8e\u416d, initobject:BufferedImage(BufferedImage::<init>, d2i:int(invokevirtual:double(Rectangle::getWidth, var_3_91:Rectangle)), d2i:int(invokevirtual:double(Rectangle::getHeight, var_3_91:Rectangle)), and:int(ldc:int(5635), ldc:int(8243))))
                    var_4_B5 = invokevirtual:Graphics2D(BufferedImage::createGraphics, getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\u8aa5\u3e2a\ucb79\u8cae\u3504, this:\ud217\u624e\u34df\u0b8e\u416d))
                    invokevirtual:boolean(Graphics::drawImage, var_4_B5:Graphics2D[expected:Graphics], getfield:BufferedImage[expected:Image](\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), and:int(ldc:int(21287), ldc:int(-21440)), and:int(ldc:int(-16398), ldc:int(16397)), aconstnull:ImageObserver())
                    
                    if (cmpeq:boolean(invokevirtual:int(BufferedImage::getHeight, getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d)), ldc:int(32))) {
                        var_5_102 = invokevirtual:BufferedImage(BufferedImage::getSubimage, getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), and:int(ldc:int(-19614), ldc:int(19612)), ldc:int(16), ldc:int(16), ldc:int(16))
                        var_6_113 = invokevirtual:BufferedImage(BufferedImage::getSubimage, getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), ldc:int(40), ldc:int(16), ldc:int(16), ldc:int(16))
                        invokevirtual:boolean(Graphics::drawImage, var_4_B5:Graphics2D[expected:Graphics], var_5_102:BufferedImage[expected:Image], ldc:int(16), ldc:int(48), aconstnull:ImageObserver())
                        invokevirtual:boolean(Graphics::drawImage, var_4_B5:Graphics2D[expected:Graphics], var_6_113:BufferedImage[expected:Image], ldc:int(32), ldc:int(48), aconstnull:ImageObserver())
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-807704125))
                    invokevirtual:void(Graphics::dispose, var_4_B5:Graphics2D[expected:Graphics])
                }
            }
            
            return:BufferedImage(getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\u8aa5\u3e2a\ucb79\u8cae\u3504, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\ud36e\uc31c\u4c2b\u6fb0() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u8aa5\u516c\u64f2\uc229\u64f2\ucef1 \u3d64\u99f7\u93a2\u5db4\ubb2b() {
        var_1_61 : int
        stack_90_0 : \u8aa5\u516c\u64f2\uc229\u64f2\ucef1 [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-357049356), ldc:int(1788075669))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::contains, getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d), loadelement:String[expected:CharSequence](getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(2511), ldc:int(14)))))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2123882430))
                stack_90_0 = getstatic:\u8aa5\u516c\u64f2\uc229\u64f2\ucef1(\u8aa5\u516c\u64f2\uc229\u64f2\ucef1::\ub7dc\u527a\u7ce1\u1833\u8aa5\u3504)
            }
            else {
                stack_90_0 = getstatic:\u8aa5\u516c\u64f2\uc229\u64f2\ucef1(\u8aa5\u516c\u64f2\uc229\u64f2\ucef1::\u873d\u5bc4\u56bd\u6198\u6d69\ucb79)
            }
            
            return:\u8aa5\u516c\u64f2\uc229\u64f2\ucef1(stack_90_0:\u8aa5\u516c\u64f2\uc229\u64f2\ucef1)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u385b\ud7e8\u71ae\u7043\uc3e3\u3776 \ub171\ub8be\u873d\u9033\u7330() {
        var_3_7A : String
        var_5_95 : YggdrasilUserAuthentication
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        
        if (logicalnot:boolean(invokevirtual:boolean(\ud217\u624e\u34df\u0b8e\u416d::\u93a2\ud12e\u71ae\uafe7\uc84e, this:\ud217\u624e\u34df\u0b8e\u416d))) {
            var_3_7A = loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(4096), ldc:int(4098)))
            var_5_95 = initobject:YggdrasilUserAuthentication(YggdrasilUserAuthentication::<init>, initobject:YggdrasilAuthenticationService(YggdrasilAuthenticationService::<init>, getstatic:Proxy(Proxy::NO_PROXY), var_3_7A:String), var_3_7A:String, getstatic:Agent(Agent::MINECRAFT))
            invokevirtual:void(YggdrasilUserAuthentication::setUsername, var_5_95:YggdrasilUserAuthentication, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, this:\ud217\u624e\u34df\u0b8e\u416d))
            invokevirtual:void(YggdrasilUserAuthentication::setPassword, var_5_95:YggdrasilUserAuthentication, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ud12e\u839e\ub8be\u5d20, this:\ud217\u624e\u34df\u0b8e\u416d))
            invokevirtual:void(YggdrasilUserAuthentication::logIn, var_5_95:YggdrasilUserAuthentication)
            invokevirtual:void(\ud217\u624e\u34df\u0b8e\u416d::\u6435\u3e2a\u120d\u494c\u5d20, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(YggdrasilUserAuthentication::getSelectedProfile, var_5_95:YggdrasilUserAuthentication)))
            invokevirtual:void(\ud217\u624e\u34df\u0b8e\u416d::\u718f\u69d9\ud7e8\u51fa\u8753, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(UUID::toString, invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(YggdrasilUserAuthentication::getSelectedProfile, var_5_95:YggdrasilUserAuthentication))))
            invokevirtual:void(\ud217\u624e\u34df\u0b8e\u416d::\u1187\ud36e\uc31c\u4c2b\u6fb0, this:\ud217\u624e\u34df\u0b8e\u416d)
            putfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u51fa\u7d52\ub102\uc2bd\u3e2a, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:long(System::currentTimeMillis))
            return:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(initobject:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::<init>, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(YggdrasilUserAuthentication::getSelectedProfile, var_5_95:YggdrasilUserAuthentication)), invokevirtual:String(String::replaceAll, invokevirtual:String(UUID::toString, invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(YggdrasilUserAuthentication::getSelectedProfile, var_5_95:YggdrasilUserAuthentication))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(3090), ldc:int(290))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(12830), ldc:int(-12832)))), invokevirtual:String(YggdrasilUserAuthentication::getAuthenticatedToken, var_5_95:YggdrasilUserAuthentication), invokevirtual:String(Enum<E>::name, invokevirtual:\u8aa5\u516c\u64f2\uc229\u64f2\ucef1[expected:Enum<\u8aa5\u516c\u64f2\uc229\u64f2\ucef1>](\ud217\u624e\u34df\u0b8e\u416d::\u3d64\u99f7\u93a2\u5db4\ubb2b, this:\ud217\u624e\u34df\u0b8e\u416d))))
        }
        
        invokevirtual:void(\ud217\u624e\u34df\u0b8e\u416d::\u6435\u3e2a\u120d\u494c\u5d20, this:\ud217\u624e\u34df\u0b8e\u416d, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, this:\ud217\u624e\u34df\u0b8e\u416d))
        return:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(initobject:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::<init>, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, this:\ud217\u624e\u34df\u0b8e\u416d), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(16714), ldc:int(-17740))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(-17469), ldc:int(16444))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(528), ldc:int(529)))))
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\uc910\ub6ab\uafe7\ud217\u7330\u600f \u0a06\u9937\ud158\u8389\u67d0() {
        var_1_6A4 : int
        var_3_6F : \uc910\ub6ab\uafe7\ud217\u7330\u600f
        var_1_684 : int
        var_4_68C : ByteArrayOutputStream
        var_1_693 : int
        var_5_69D : Base64OutputStream
        var_6_6B0 : String
        var_7_6E6 : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_6A4 = and:int(and:int(ldc:int(-298360253), ldc:int(-419452294)), ldc:int(-994580725))
            var_3_6F = initobject:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::<init>)
            
            loop {
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-970369682))
                    goto(Label_1547)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1347102269))
                    goto(Label_1425)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_1012)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0879)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-111639126))
                    goto(Label_0719)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0568)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-474086))
                    goto(Label_0432)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-561267463))
                }
                else {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1933607718))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(8231), ldc:int(18567))), invokevirtual:\u1833\ubff1\u960f\u516c\u4f52\u9a18[expected:Object](\ud217\u624e\u34df\u0b8e\u416d::\ub18d\u4d85\uc9f6\u7043\u527a, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_0263:
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1601765443))
                    goto(Label_1547)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1750182311))
                    goto(Label_1425)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1786730320))
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(823220740))
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1245224925))
                    goto(Label_1012)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0879)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1057269743))
                    goto(Label_0719)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0568)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(343763585))
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1233685090))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(5637), ldc:int(23))), getfield:String[expected:Object](\ud217\u624e\u34df\u0b8e\u416d::\uc2e8\ud51e\u8389\uf94d\u3dd3, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_0432:
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1547)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_1425)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(663708561))
                    goto(Label_1012)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0879)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-456210594))
                    goto(Label_0719)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-2112613042))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-684234050))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(4164), ldc:int(4162))), invokestatic:String[expected:Object](\ud217\u624e\u34df\u0b8e\u416d::\uc7fe\ub6ab\u36d3\u69d9\ud158, getfield:String(\ud217\u624e\u34df\u0b8e\u416d::\u0b8e\ubf56\u946b\u71ae\u6b5f, this:\ud217\u624e\u34df\u0b8e\u416d)))
                }
                
                Label_0568:
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1547)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-161231498))
                    goto(Label_1425)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1553726122))
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1151622770))
                    goto(Label_1012)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1848035578))
                    goto(Label_0879)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1669869338))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-432703781))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(-32224), ldc:int(-32216))), getfield:String[expected:Object](\ud217\u624e\u34df\u0b8e\u416d::\u0800\u4d85\u3bc9\u6b0d\u59ec, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_0719:
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1261290813))
                    goto(Label_1547)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-497573909))
                    goto(Label_1425)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1552378809))
                    goto(Label_1163)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1925508640))
                    goto(Label_1012)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(174083956))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(611125457))
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-948472594))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(8708), ldc:int(8717))), getfield:String[expected:Object](\ud217\u624e\u34df\u0b8e\u416d::\u40a9\ud51e\ua562\ucef1\u873d, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_0879:
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(2067990591))
                    goto(Label_1547)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1425)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-637948594))
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1592417252))
                        goto(Label_0263)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1212815322))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(24878), ldc:int(1036))), getfield:int(\ud217\u624e\u34df\u0b8e\u416d::\u56bd\ub32d\u8aa5\u8350\u836c, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_1012:
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1547)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1776863569))
                    goto(Label_1425)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(970285339))
                    goto(Label_1296)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(254664447))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(975938123))
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(715550103))
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1359139686))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(18443), ldc:int(523))), getfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u51fa\u7d52\ub102\uc2bd\u3e2a, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_1163:
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1275944022))
                    goto(Label_1547)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1470088623))
                    goto(Label_1425)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1292286258))
                        goto(Label_1012)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-453509673))
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(13482), ldc:int(331))), getfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u9af2\u6c52\u6b0d\u6bb9\uc31c, this:\ud217\u624e\u34df\u0b8e\u416d))
                }
                
                Label_1296:
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1547)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1548544348))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1012)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1178702931))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(327480077))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(808224603))
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1237894062))
                    
                    if (cmpeq:boolean(getfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), aconstnull:BufferedImage())) {
                        looporswitchbreak()
                    }
                }
                
                Label_1425:
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1298635763))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(335200987))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1012)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1358247473))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(2)), ldc:int(0))) {
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(560632963))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1388339094))
                }
                
                Label_1547:
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-1312714275))
                    goto(Label_1425)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_1296)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1163)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-2032814013))
                    goto(Label_1012)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0879)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(1782207349))
                    goto(Label_0719)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0568)
                }
                
                if (cmpeq:boolean(and:int(var_1_6A4:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_6A4 = and:int(var_1_6A4:int, ldc:int(920762154))
                    goto(Label_0432)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0263)
                }
                
                if (cmpne:boolean(and:int(var_1_6A4:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_684 = and:int(var_1_6A4:int, ldc:int(-159438877))
                    var_4_68C = initobject:ByteArrayOutputStream(ByteArrayOutputStream::<init>)
                    var_1_693 = and:int(var_1_684:int, ldc:int(-163766089))
                    var_5_69D = initobject:Base64OutputStream(Base64OutputStream::<init>, var_4_68C:OutputStream)
                    var_1_6A4 = and:int(var_1_693:int, ldc:int(-1648530989))
                    var_6_6B0 = loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(-29735), ldc:int(28710)))
                    
                    try {
                        invokestatic:boolean(ImageIO::write, getfield:BufferedImage[expected:RenderedImage](\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(8271), ldc:int(18991))), var_5_69D:OutputStream)
                        var_6_6B0 = invokevirtual:String(ByteArrayOutputStream::toString, var_4_68C:ByteArrayOutputStream, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(16404), ldc:int(4408))))
                        var_1_6A4 = and:int(var_1_6A4:int, ldc:int(-407391281))
                    }
                    catch (java.io.IOException var_7_6E6) {
                        invokevirtual:void(Throwable::printStackTrace, var_7_6E6:IOException[expected:Throwable])
                    }
                    
                    invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(2573), ldc:int(365))), var_6_6B0:String[expected:Object])
                    looporswitchbreak()
                }
            }
            
            return:\uc910\ub6ab\uafe7\ud217\u7330\u600f(var_3_6F:\uc910\ub6ab\uafe7\ud217\u7330\u600f)
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ubff1\u960f\u516c\u4f52\u9a18 \ub18d\u4d85\uc9f6\u7043\u527a() {
        var_1_61 : int
        var_3_69 : \u1833\ubff1\u960f\u516c\u4f52\u9a18
        var_4_71 : Iterator<\u873d\uc229\u9033\u0800\uf9c5>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-695637791), ldc:int(-558650935))
            var_3_69 = initobject:\u1833\ubff1\u960f\u516c\u4f52\u9a18(\u1833\ubff1\u960f\u516c\u4f52\u9a18::<init>)
            var_4_71 = invokevirtual:Iterator<\u873d\uc229\u9033\u0800\uf9c5>(ArrayList<\u873d\uc229\u9033\u0800\uf9c5>::iterator, getfield:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u47c2\u8d98\uceb8\ucef1\uf995, this:\ud217\u624e\u34df\u0b8e\u416d))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-749649925))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_71:Iterator<\u873d\uc229\u9033\u0800\uf9c5>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:\u1833\ubff1\u960f\u516c\u4f52\u9a18(\u1833\ubff1\u960f\u516c\u4f52\u9a18::\u0a06\ubff1\u873d\u92ee\u4f52\u2dcc, var_3_69:\u1833\ubff1\u960f\u516c\u4f52\u9a18, invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\u873d\uc229\u9033\u0800\uf9c5::\u3dd3\u4179\u839e\ubcb0\u4d85, checkcast:\u873d\uc229\u9033\u0800\uf9c5(\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5.class, invokeinterface:\u873d\uc229\u9033\u0800\uf9c5(Iterator<\u873d\uc229\u9033\u0800\uf9c5>::next, var_4_71:Iterator<\u873d\uc229\u9033\u0800\uf9c5>))))
            }
            
            return:\u1833\ubff1\u960f\u516c\u4f52\u9a18(var_3_69:\u1833\ubff1\u960f\u516c\u4f52\u9a18)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \uc7fe\ub6ab\u36d3\u69d9\ud158(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(initobject:String(String::<init>, invokestatic:byte[](Base64::encodeBase64, invokevirtual:byte[](String::getBytes, p0:String)), invokestatic:Charset(Charset::forName, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(31155), ldc:int(600))))))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u4e72\ub18d\u92ee\u93a2\ud12e(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(initobject:String(String::<init>, invokestatic:byte[](Base64::decodeBase64, invokevirtual:byte[](String::getBytes, p0:String)), invokestatic:Charset(Charset::forName, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(73), ldc:int(89))))))
        }
        
        goto(Label_0006)
    }
    
    public int \u759a\uc910\u61a4\ub1b9\ub32d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\ud217\u624e\u34df\u0b8e\u416d::\u56bd\ub32d\u8aa5\u8350\u836c, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public long \u946b\u16f6\ubefe\u76bc\uae87() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long(getfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u51fa\u7d52\ub102\uc2bd\u3e2a, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public long \u16f6\u960f\u7ce1\u16f6\u59ec() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long(getfield:long(\ud217\u624e\u34df\u0b8e\u416d::\u9af2\u6c52\u6b0d\u6bb9\uc31c, this:\ud217\u624e\u34df\u0b8e\u416d))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5 \u416d\uff55\ufcaf\u839e\uc7fe(java.lang.String p0) {
        var_2_78 : int
        var_4_69 : Iterator<\u873d\uc229\u9033\u0800\uf9c5>
        var_5_AA : \u873d\uc229\u9033\u0800\uf9c5
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_78 = and:int(ldc:int(1473320914), ldc:int(800846067))
        var_4_69 = invokevirtual:Iterator<\u873d\uc229\u9033\u0800\uf9c5>(ArrayList<\u873d\uc229\u9033\u0800\uf9c5>::iterator, invokevirtual:ArrayList<\u873d\uc229\u9033\u0800\uf9c5>(\ud217\u624e\u34df\u0b8e\u416d::\u3c25\ub70c\u5bc4\u8640\ubefe, this:\ud217\u624e\u34df\u0b8e\u416d))
        
        loop {
            if (cmpne:boolean(and:int(var_2_78:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_78 = and:int(var_2_78:int, ldc:int(133969530))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_69:Iterator<\u873d\uc229\u9033\u0800\uf9c5>)) {
                    var_5_AA = checkcast:\u873d\uc229\u9033\u0800\uf9c5(\u5d20\u7043\u88c5\u5db4\uf94d.\u873d\uc229\u9033\u0800\uf9c5.class, invokeinterface:\u873d\uc229\u9033\u0800\uf9c5(Iterator<\u873d\uc229\u9033\u0800\uf9c5>::next, var_4_69:Iterator<\u873d\uc229\u9033\u0800\uf9c5>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\u873d\uc229\u9033\u0800\uf9c5::\ub6ab\u7ce1\ub6ab\u8258\u3a62, var_5_AA:\u873d\uc229\u9033\u0800\uf9c5), p0:String[expected:Object]))) {
                        var_2_78 = and:int(var_2_78:int, ldc:int(-141153581))
                        loopcontinue()
                    }
                    
                    return:\u873d\uc229\u9033\u0800\uf9c5(var_5_AA:\u873d\uc229\u9033\u0800\uf9c5)
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_78:int, ldc:int(131072)), ldc:int(0))) {
                return:\u873d\uc229\u9033\u0800\uf9c5(aconstnull:\u873d\uc229\u9033\u0800\uf9c5())
            }
            
            var_2_78 = and:int(var_2_78:int, ldc:int(625654072))
        }
    }
    
    public boolean \u93a2\ud12e\u71ae\uafe7\uc84e() {
        var_1_61 : int
        stack_B5_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-708432930), ldc:int(-1110082561))
            
            if (logicaland:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, invokestatic:Pattern(Pattern::compile, loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(16469), ldc:int(3345)))), invokevirtual:String[expected:CharSequence](\ud217\u624e\u34df\u0b8e\u416d::\u3711\ub113\u52d3\ubb2b\ub18d, this:\ud217\u624e\u34df\u0b8e\u416d))), cmpeq:boolean(invokevirtual:int(String::length, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ud12e\u839e\ub8be\u5d20, this:\ud217\u624e\u34df\u0b8e\u416d)), ldc:int(0)))) {
                stack_B5_0 = and:int(ldc:int(14401), ldc:int(407))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-641447463))
                stack_B5_0 = and:int(ldc:int(-9039), ldc:int(9030))
            }
            
            return:boolean(stack_B5_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud158\u8258\u3776\u4179\u3e75$0() {
        var_1_CB : int
        var_3_C5 : Exception
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_CB = and:int(ldc:int(-1183932613), ldc:int(-1193304346))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_CB:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_CB = and:int(var_1_CB:int, ldc:int(704212450))
                    }
                    else {
                        var_1_CB = and:int(var_1_CB:int, ldc:int(-620767308))
                        putfield:BufferedImage(\ud217\u624e\u34df\u0b8e\u416d::\ucfaf\ud7e8\ub32d\u6435\u40a9, this:\ud217\u624e\u34df\u0b8e\u416d, invokestatic:BufferedImage(ImageIO::read, initobject:URL(URL::<init>, invokestatic:String(\u3bd6\u6d99\ub113\u4d85\u71f1::\ubf56\u4d85\u8aa5\ub102\u56bd, invokevirtual:String(String::replaceAll, invokevirtual:String(\ud217\u624e\u34df\u0b8e\u416d::\u983f\ua3b4\u0c95\u3c25\uc7fe, this:\ud217\u624e\u34df\u0b8e\u416d), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), xor:int(ldc:int(1547), ldc:int(1545))), loadelement:String(getstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa), and:int(ldc:int(-535), ldc:int(534))))))))
                    }
                    
                    if (cmpne:boolean(and:int(var_1_CB:int, ldc:int(4194304)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_CB = and:int(var_1_CB:int, ldc:int(1166891866))
                }
                
                var_1_CB = and:int(var_1_CB:int, ldc:int(-118564865))
            }
            catch (java.lang.Exception var_3_C5) {
                var_1_CB = and:int(var_1_CB:int, ldc:int(-101771609))
                invokevirtual:void(Throwable::printStackTrace, var_3_C5:Exception[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_378 : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_38B_0 : byte[] [generated]
        stack_3F3_0 : byte[] [generated]
        stack_465_0 : byte[] [generated]
        stack_4BB_0 : byte[] [generated]
        var_4_363 : int
        var_3_368 : byte[]
        var_5_369 : int
        expr_38E : byte [generated]
        var_0_3E9 : int
        expr_3F3 : byte [generated]
        stack_433_2 : byte [generated]
        stack_410_0 : byte [generated]
        expr_B0 : int [generated]
        var_2_E7 : byte[]
        expr_EB : int [generated]
        var_3_453 : byte[]
        var_5_454 : int
        expr_112 : int [generated]
        var_3_4A9 : byte[]
        var_5_4AA : int
        var_3_154 : String
        stack_352_0 : String[] [generated]
        expr_166 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_378 = and:int(ldc:int(1238495475), ldc:int(467532011))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_E7_0 = stack_E9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_38B_0 = stack_3F3_0 = stack_465_0 = stack_4BB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("bWsAANwGAvz/knuUqikQB3s/HYbzlBV7qsaIkoNF1JY0DBIymm2SPbSQhq6G1o6goKSckHGKR4GKe7qOxmeKLyVRQ7h31MpjrnuIvMIEqJqQY3thZ2GYhpKMuKxlvpjAWW+oYXtdjKZHume2kKB9KWEtYy8=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_363 = expr_6E:int
        var_3_368 = newarray:byte[](byte.class, expr_6E:int)
        var_5_369 = expr_6E:int
        Label_0875:
        
        while (cmpne:boolean(and:int(var_0_378:int, ldc:int(8192)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(1844968178))
            var_5_369 = add:int(var_5_369:int, ldc:int(-1))
            expr_38E = add:byte(loadelement:byte(stack_38B_0:byte[], var_5_369:int), ldc:byte(122))
            storeelement:byte(var_3_368:byte[], var_5_369:int, or:int(and:int(shl:int(expr_38E:byte, and:int(ldc:int(5892), ldc:int(16396))), ldc:int(-16)), and:int(shr:int(expr_38E:byte[expected:int], xor:int(ldc:int(26628), ldc:int(26624))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_38B_0 = stack_3F3_0 = stack_465_0 = stack_4BB_0 = var_3_368:byte[]
            goto(Label_0115)
        }
        
        var_0_378 = and:int(var_0_378:int, ldc:int(1340569248))
        Label_0979:
        
        while (cmpne:boolean(and:int(var_0_378:int, ldc:int(64)), ldc:int(0))) {
            var_0_3E9 = and:int(var_0_378:int, ldc:int(1904208379))
            var_5_369 = add:int(var_5_369:int, ldc:int(-1))
            expr_3F3 = stack_433_2 = loadelement(stack_3F3_0, var_5_369)
            
            if (cmplt:boolean(add:int(add:int(var_5_369:int, ldc:int(6)), neg:int(var_4_363:int)), ldc:int(0))) {
                stack_433_2 = stack_410_0 = add:byte(expr_3F3:byte, loadelement:byte(var_3_368:byte[], add:int(var_5_369:int, ldc:int(6))))
                goto(Label_1056)
            }
            
            Label_1024:
            
            if (cmpeq:boolean(and:int(var_0_3E9:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_3E9 = and:int(var_0_3E9:int, ldc:int(-2091664642))
                stack_433_2 = stack_410_0 = add:byte(expr_3F3:byte, ldc:byte(6))
            }
            
            Label_1056:
            
            if (cmpeq:boolean(and:int(var_0_3E9:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_1024)
            }
            
            var_0_378 = and:int(var_0_3E9:int, ldc:int(-872811802))
            storeelement:byte(var_3_368:byte[], var_5_369:int, stack_433_2:byte)
            
            if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_38B_0 = stack_3F3_0 = stack_465_0 = stack_4BB_0 = var_3_368:byte[]
            goto(Label_0181)
        }
        
        var_0_378 = and:int(var_0_378:int, ldc:int(311847180))
        goto(Label_0875)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(32)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(1718073024))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(255363803))
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(2)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(2058912269))
        }
        else {
            var_0_378 = and:int(var_0_378:int, ldc:int(-75907849))
            expr_B0 = arraylength:int(stack_B0_0:byte[])
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_4_363 = expr_B0:int
                var_3_368 = newarray:byte[](byte.class, expr_B0:int)
                var_5_369 = expr_B0:int
                goto(Label_0979)
            }
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(-1259576185))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(64)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(1293784869))
        }
        else {
            if (cmpne:boolean(and:int(var_0_378:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_378 = and:int(var_0_378:int, ldc:int(1666971634))
            var_2_E7 = stack_E7_0:byte[]
            expr_EB = add:int(arraylength:int(stack_E9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_EB:int, ldc:int(0))) {
                var_3_453 = newarray:byte[](byte.class, expr_EB:int)
                var_5_454 = expr_EB:int
                
                loop {
                    var_0_378 = and:int(var_0_378:int, ldc:int(-302270229))
                    var_5_454 = add:int(var_5_454:int, ldc:int(-1))
                    storeelement:byte(var_3_453:byte[], var_5_454:int, add:int(shl:int(loadelement:byte(stack_465_0:byte[], var_5_454:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_E7:byte[], add:int(var_5_454:int, xor:int(ldc:int(1025), ldc:int(1024)))), ldc:int(5)), and:int(ldc:int(12039), ldc:int(95)))))
                    
                    if (cmpne:boolean(var_5_454:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_38B_0 = stack_3F3_0 = stack_465_0 = stack_4BB_0 = var_3_453:byte[]
            }
        }
        
        Label_0240:
        
        if (cmpne:boolean(and:int(var_0_378:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_378:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0181)
            }
            
            if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_378 = and:int(var_0_378:int, ldc:int(729129978))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_4A9 = newarray:byte[](byte.class, expr_112:int)
                var_5_4AA = expr_112:int
                
                loop {
                    var_0_378 = and:int(var_0_378:int, ldc:int(-136992774))
                    var_5_4AA = add:int(var_5_4AA:int, ldc:int(-1))
                    storeelement:byte(var_3_4A9:byte[], var_5_4AA:int, xor:byte(loadelement:byte(stack_4BB_0:byte[], var_5_4AA:int), ldc:byte(105)))
                    
                    if (cmpne:boolean(var_5_4AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_38B_0 = stack_3F3_0 = stack_465_0 = stack_4BB_0 = var_3_4A9:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(65536)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(1431272941))
            goto(Label_0181)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(2)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(-1943384341))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_352_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(27419), ldc:int(18)))
        expr_166 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4694), ldc:int(4676)))
        storeelement:String(expr_166:String[], and:int(ldc:int(-17663), ldc:int(16558)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(3024), ldc:int(-15317)), and:int(ldc:int(-29293), ldc:int(25188))))
        storeelement:String(expr_166:String[], and:int(ldc:int(35), ldc:int(24658)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-19077), ldc:int(19076)), xor:int(ldc:int(538), ldc:int(539))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(20493), ldc:int(20483)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(16416), ldc:int(16417)), and:int(ldc:int(29218), ldc:int(1094))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(328), ldc:int(344)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-28659), ldc:int(-28657)), xor:int(ldc:int(1312), ldc:int(1319))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(44), ldc:int(47)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(55), ldc:int(143)), and:int(ldc:int(1051), ldc:int(2611))))
        storeelement:String(expr_166:String[], and:int(ldc:int(4241), ldc:int(341)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(1155), ldc:int(1168)), xor:int(ldc:int(16658), ldc:int(16695))))
        storeelement:String(expr_166:String[], and:int(ldc:int(18455), ldc:int(9391)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(4755), ldc:int(4790)), xor:int(ldc:int(21001), ldc:int(21024))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(1170), ldc:int(1176)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(28991), ldc:int(2089)), xor:int(ldc:int(2620), ldc:int(2574))))
        storeelement:String(expr_166:String[], and:int(ldc:int(4813), ldc:int(8197)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(16754), ldc:int(2611)), xor:int(ldc:int(4118), ldc:int(4129))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(8321), ldc:int(8329)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(6719), ldc:int(503)), xor:int(ldc:int(8716), ldc:int(8780))))
        storeelement:String(expr_166:String[], and:int(ldc:int(2255), ldc:int(521)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(8474), ldc:int(8538)), xor:int(ldc:int(14902), ldc:int(14975))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(10310), ldc:int(10317)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(17359), ldc:int(8265)), xor:int(ldc:int(68), ldc:int(21))))
        storeelement:String(expr_166:String[], and:int(ldc:int(5761), ldc:int(8253)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(16977), ldc:int(1117)), xor:int(ldc:int(12590), ldc:int(12665))))
        storeelement:String(expr_166:String[], and:int(ldc:int(23), ldc:int(16902)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-32223), ldc:int(-32138)), xor:int(ldc:int(10930), ldc:int(10989))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(21250), ldc:int(21261)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(9259), ldc:int(9332)), and:int(ldc:int(1379), ldc:int(20578))))
        storeelement:String(expr_166:String[], and:int(ldc:int(20509), ldc:int(1327)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-32752), ldc:int(-32654)), xor:int(ldc:int(1131), ldc:int(1037))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(-32736), ldc:int(-32732)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(615), ldc:int(24830)), and:int(ldc:int(9851), ldc:int(18543))))
        storeelement:String(expr_166:String[], and:int(ldc:int(2062), ldc:int(620)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(20591), ldc:int(107)), and:int(ldc:int(17911), ldc:int(4211))))
        putstatic:String[](\ud217\u624e\u34df\u0b8e\u416d::\u6c56\ufe34\u1833\u3bc9\u51fa, expr_166:String[])
        putstatic:Date(\ud217\u624e\u34df\u0b8e\u416d::\u7e3f\u7e3f\u760c\u36d3\u6435, initobject:Date(Date::<init>))
    }
    
    public void \u1187\u36d3\ub7dc\u4975\uc3e3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A1 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_696 = and:int(ldc:int(-1337763032), ldc:int(-1230013489))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud217\u624e\u34df\u0b8e\u416d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1891947335))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(-710436008))
            var_5_8A = and:int(ldc:int(5148), ldc:int(-5405))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20007), ldc:int(20006)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_696:int, ldc:int(-1958006856))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(4623), ldc:int(18433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(23), ldc:int(8449)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_E3:int, ldc:int(-1810396290))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(16386), ldc:int(16387)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1919622546))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1569937129))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1926545519))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1727838450))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-97220161))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(653496237))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(85897780))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2042279118))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1239610534))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(790220502))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-329249276))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-949006607))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1842344915))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-349233191))
                            var_11_F4 = and:int(ldc:int(-12055), ldc:int(12054))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1958600445))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-410680215))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-31326382))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(365742044))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-521499873))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(814581546))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1183633253))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-496061344))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1450008775))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1021374529))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1220893595))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1685989073))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1987590794))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-877966437))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(1548), ldc:int(1549))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1564352154))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(347402037))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1243983428))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-434432884))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-2136240969))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1624907547))
                        var_11_F4 = and:int(ldc:int(-27396), ldc:int(27395))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(516609323))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1653093094))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-392222381))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(633290684))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1423446211))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-632284078))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1213884107))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1560980163))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-525931605))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1562)
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(778113923))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1612438993))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(528340461))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(857078881))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1352013493))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-594026709))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1363138311))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1913928592))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-590248193))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2019888643))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(826515373))
                        var_17_6A1 = add:int(var_16_122:int, xor:int(ldc:int(480), ldc:int(481)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(1433844568))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, and:int(ldc:int(21505), ldc:int(8705))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-963450096))
            goto(Label_0108)
        }
    }
}
