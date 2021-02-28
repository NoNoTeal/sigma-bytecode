public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ub171\u8d98\u3bc9\u183a\u965f {
    public void \ub171\u8d98\u3bc9\u183a\u965f(\u56bd\u8413\u647c\u5bc4\ud158.\u51b2\uf995\u3e2a\ub83f\u6d69 p0, java.lang.String p1, java.lang.String p2) {
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
            putfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f, p0:\u51b2\uf995\u3e2a\ub83f\u6d69)
            putfield:String(\ub171\u8d98\u3bc9\u183a\u965f::\u67e9\u7e3f\u7ce1\u071d\u5db4\u76bc, this:\ub171\u8d98\u3bc9\u183a\u965f, p2:String)
            invokespecial:Thread(Thread::<init>, this:\ub171\u8d98\u3bc9\u183a\u965f, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_791 : int
        var_3_6C : GameProfile
        
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
            var_1_791 = and:int(and:int(ldc:int(-1429178220), ldc:int(528181748)), ldc:int(-1231297100))
            var_3_6C = invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\uc84e\u4975\ud36e\u494c\u67e9\u8bb0, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1449767433))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(630473677))
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1229799395))
                        goto(Label_0656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1350190147))
                        goto(Label_0510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1091593112))
                    }
                    else {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-493229836))
                        invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\u6198\u527a\u1833\u98a4\u3bc9\u6c56, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), invokeinterface:GameProfile(MinecraftSessionService::hasJoinedServer, invokevirtual:MinecraftSessionService(\u88c5\ud171\ub113\u6435\ud51e::\u3a62\u47c2\u760c\u61a4\ub8be\uc9f6, invokestatic:\u88c5\ud171\ub113\u6435\ud51e(\u51b2\uf995\u3e2a\ub83f\u6d69::\ucfaf\ub7dc\u8258\u7d52\u3d64\u3e2a, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f))), initobject:GameProfile(GameProfile::<init>, checkcast:UUID(java.util.UUID.class, aconstnull:UUID()), invokevirtual:String(GameProfile::getName, var_3_6C:GameProfile)), getfield:String(\ub171\u8d98\u3bc9\u183a\u965f::\u67e9\u7e3f\u7ce1\u071d\u5db4\u76bc, this:\ub171\u8d98\u3bc9\u183a\u965f), invokespecial:InetAddress(\ub171\u8d98\u3bc9\u183a\u965f::\u946b\ua562\ubefe\u8258\ufe34\ub113, this:\ub171\u8d98\u3bc9\u183a\u965f)))
                    }
                    
                    Label_0270:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(938438373))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(108667611))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(888699704))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-438810435))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1191103211))
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1818787505))
                        goto(Label_0510)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1538716146))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(1307859253))
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1239452939))
                        
                        if (cmpeq:boolean(invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\uc84e\u4975\ud36e\u494c\u67e9\u8bb0, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f)), aconstnull:GameProfile())) {
                            if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u946b\u965f\u2dcc\ud217\u40a9\u3504, invokestatic:\u88c5\ud171\ub113\u6435\ud51e(\u51b2\uf995\u3e2a\ub83f\u6d69::\ucfaf\ub7dc\u8258\u7d52\u3d64\u3e2a, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f)))) {
                                goto(Label_0818)
                            }
                            
                            invokevirtual:void(\u51b2\uf995\u3e2a\ub83f\u6d69::\u8d98\u7873\u51fa\u7c6b\uf94d\u71ae, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), xor:int(ldc:int(0), ldc:int(2)))))
                            goto(Label_1356)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1915579948))
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1300275096))
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(1660681399))
                    }
                    
                    Label_0510:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-986624056))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-893329297))
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1490368517))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-1997680927))
                            goto(Label_0270)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(240579286))
                        invokeinterface:void(Logger::info, invokestatic:Logger(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4f52\u7e3f\u3a62\uafe7\u6d69\u3dd3), loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), and:int(ldc:int(4928), ldc:int(-4929))), invokevirtual:String[expected:Object](GameProfile::getName, invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\uc84e\u4975\ud36e\u494c\u67e9\u8bb0, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f))), invokevirtual:UUID[expected:Object](GameProfile::getId, invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\uc84e\u4975\ud36e\u494c\u67e9\u8bb0, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f))))
                    }
                    
                    Label_0656:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(755812070))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-300654417))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1686008721))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1156967153))
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1347630000))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0510)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-1070218233))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-389057320))
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(596897694))
                        invokestatic:\u3776\u7c6b\u5fe1\u9af2\u5140(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4d85\u4179\u6d99\uf9c5\u3776\u1187, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), getstatic:\u3776\u7c6b\u5fe1\u9af2\u5140(\u3776\u7c6b\u5fe1\u9af2\u5140::\u839e\u71ae\u4bc8\uc2bd\u8350\u51b2))
                        goto(Label_1470)
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0510)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-391202959))
                            goto(Label_0270)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-1616618159))
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(59894967))
                    }
                    
                    Label_0909:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1594246901))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1834967247))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1781982908))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-693326360))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(328310235))
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(1972537224))
                            goto(Label_0510)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-1916282369))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0270)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(938603167))
                        invokeinterface:void(Logger::warn, invokestatic:Logger(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4f52\u7e3f\u3a62\uafe7\u6d69\u3dd3), loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), xor:int(ldc:int(136), ldc:int(137))))
                    }
                    
                    Label_1059:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1492585280))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(1688007827))
                            goto(Label_0909)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(1589042860))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0510)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-76211675))
                            goto(Label_0270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(-403605098))
                        invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\u6198\u527a\u1833\u98a4\u3bc9\u6c56, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), invokevirtual:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\u97b7\u56bd\u3a62\u12cb\u67d0\ubcb0, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), var_3_6C:GameProfile))
                    }
                    
                    Label_1182:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1309112858))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1907427006))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-217786143))
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(199986911))
                            goto(Label_0909)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-924710576))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(548330973))
                            goto(Label_0656)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0510)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(420304612))
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1296763651))
                        invokestatic:\u3776\u7c6b\u5fe1\u9af2\u5140(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4d85\u4179\u6d99\uf9c5\u3776\u1187, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), getstatic:\u3776\u7c6b\u5fe1\u9af2\u5140(\u3776\u7c6b\u5fe1\u9af2\u5140::\u839e\u71ae\u4bc8\uc2bd\u8350\u51b2))
                        goto(Label_1470)
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1182)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0909)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(-804175205))
                            goto(Label_0656)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0510)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(2144980476))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(-2081329484))
                        invokeinterface:void(Logger::error, invokestatic:Logger(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4f52\u7e3f\u3a62\uafe7\u6d69\u3dd3), loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), xor:int(ldc:int(681), ldc:int(682))), invokevirtual:String(GameProfile::getName, var_3_6C:GameProfile))
                    }
                    
                    Label_1470:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-565788332))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(478535531))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1245945782))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1198540380))
                        goto(Label_0510)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1487416037))
                        goto(Label_0270)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_791 = and:int(var_1_791:int, ldc:int(315914968))
                }
                
                var_1_791 = and:int(var_1_791:int, ldc:int(-1906639433))
            }
            catch (com.mojang.authlib.exceptions.AuthenticationUnavailableException var_4_640) {
                loop {
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1981)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1882)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1802)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(2144649262))
                    }
                    else {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-757471562))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u946b\u965f\u2dcc\ud217\u40a9\u3504, invokestatic:\u88c5\ud171\ub113\u6435\ud51e(\u51b2\uf995\u3e2a\ub83f\u6d69::\ucfaf\ub7dc\u8258\u7d52\u3d64\u3e2a, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f))))) {
                            invokevirtual:void(\u51b2\uf995\u3e2a\ub83f\u6d69::\u8d98\u7873\u51fa\u7c6b\uf94d\u71ae, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), and:int(ldc:int(1045), ldc:int(16399)))))
                            goto(Label_1981)
                        }
                    }
                    
                    Label_1663:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1565591068))
                        goto(Label_1981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1802)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1035892726))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(685282674))
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(-2030142978))
                    }
                    
                    Label_1727:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(538446241))
                        goto(Label_1981)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-1711981848))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1663)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(2075583391))
                        invokeinterface:void(Logger::warn, invokestatic:Logger(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4f52\u7e3f\u3a62\uafe7\u6d69\u3dd3), loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), xor:int(ldc:int(4353), ldc:int(4357))))
                    }
                    
                    Label_1802:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(128)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-85866100))
                        goto(Label_1981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1727)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(2083231067))
                            goto(Label_1663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16384)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(1505913455))
                            loopcontinue()
                        }
                        
                        var_1_791 = and:int(var_1_791:int, ldc:int(1941496727))
                        invokestatic:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\u6198\u527a\u1833\u98a4\u3bc9\u6c56, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), invokevirtual:GameProfile(\u51b2\uf995\u3e2a\ub83f\u6d69::\u97b7\u56bd\u3a62\u12cb\u67d0\ubcb0, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), var_3_6C:GameProfile))
                    }
                    
                    Label_1882:
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(-22171831))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(16384)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(1192252369))
                            goto(Label_1802)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1727)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_791 = and:int(var_1_791:int, ldc:int(442329495))
                            invokestatic:\u3776\u7c6b\u5fe1\u9af2\u5140(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4d85\u4179\u6d99\uf9c5\u3776\u1187, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f), getstatic:\u3776\u7c6b\u5fe1\u9af2\u5140(\u3776\u7c6b\u5fe1\u9af2\u5140::\u839e\u71ae\u4bc8\uc2bd\u8350\u51b2))
                            looporswitchbreak()
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1981:
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(1311689103))
                        goto(Label_1882)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_791 = and:int(var_1_791:int, ldc:int(617147887))
                        goto(Label_1727)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_791:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_791:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_791 = and:int(var_1_791:int, ldc:int(316532885))
                    invokeinterface:void(Logger::error, invokestatic:Logger(\u51b2\uf995\u3e2a\ub83f\u6d69::\u4f52\u7e3f\u3a62\uafe7\u6d69\u3dd3), loadelement:String(getstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0), xor:int(ldc:int(16518), ldc:int(16512))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.net.InetAddress \u946b\ua562\ubefe\u8258\ufe34\ub113() {
        var_3_6A : SocketAddress
        
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
            var_3_6A = invokevirtual:SocketAddress(\u527a\u494c\u88c5\u965f\u759a::\ucb79\u47c2\u960f\u36d3\u6d69\u6c52, getfield:\u527a\u494c\u88c5\u965f\u759a(\u51b2\uf995\u3e2a\ub83f\u6d69::\u98a4\u8d98\u7049\u5db4\u9033\u9a18, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f)))
            return:InetAddress(ternaryop:InetAddress(logicaland:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u92ff\u93a2\ua068\ub83f\u7043\uf9c5, invokestatic:\u88c5\ud171\ub113\u6435\ud51e(\u51b2\uf995\u3e2a\ub83f\u6d69::\ucfaf\ub7dc\u8258\u7d52\u3d64\u3e2a, getfield:\u51b2\uf995\u3e2a\ub83f\u6d69(\ub171\u8d98\u3bc9\u183a\u965f::\u3711\u5654\ua068\uc29a\u7d52\ua61f, this:\ub171\u8d98\u3bc9\u183a\u965f))), instanceof:boolean(java.net.InetSocketAddress.class, var_3_6A:InetSocketAddress[expected:SocketAddress])), invokevirtual:InetAddress(InetSocketAddress::getAddress, checkcast:InetSocketAddress(java.net.InetSocketAddress.class, var_3_6A:InetSocketAddress[expected:SocketAddress])), aconstnull:InetAddress()))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_156_0 : byte[] [generated]
        stack_25D_0 : byte[] [generated]
        stack_2E2_0 : byte[] [generated]
        stack_31D_0 : byte[] [generated]
        stack_373_0 : byte[] [generated]
        var_4_23E : int
        var_3_243 : byte[]
        var_5_244 : int
        var_0_253 : int
        expr_25D : byte [generated]
        stack_2A6_2 : byte [generated]
        stack_283_0 : byte [generated]
        var_0_80 : int
        expr_A7 : int [generated]
        var_2_DC : byte[]
        expr_E0 : int [generated]
        var_3_30B : byte[]
        var_5_30C : int
        expr_118 : int [generated]
        var_3_361 : byte[]
        var_5_362 : int
        expr_376 : byte [generated]
        var_3_162 : String
        stack_237_0 : String[] [generated]
        expr_174 : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(-1654674041), ldc:int(-671219910))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DC_0 = stack_DE_0 = stack_116_0 = stack_118_0 = stack_156_0 = stack_25D_0 = stack_2E2_0 = stack_31D_0 = stack_373_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("20i9Pr8CgT1/wK/DAcYFUL+Ea7tFvC0PgT5A/4KEQXHSvrr8/j8CBfETAP48/T1/sf+QBkROBbJy/QW9z8rwwfCGv9E9jb+xwoTCP4/7fABtAQF/AVREADCE/MBFUL+Ea7tFvC1TQLxETfyA//vDAnj+wAAAiLPEv7CFT3+Bjb+xwoTCP4/7fABtAQbDsdK+uvz+PwIF8RMA/jz9PX+x/5AGRE4Fs/h2+7S+hEa3CxF9xVCB7oX/rrzWK39X/AFSwDsDfABuLoQEcABWv/yRD+2Bf61/zTzAA0ODw4D/fT/sP5FFvxACf2yGQoPCT/o/fYHCQ8HCvT1DAIBxwPuEPE6BQXwCRPHABUH9Vf9Ag0C/gzh6gT+8hERAP8HCvT1DAIBxwPuEPE6BQXwCRPLCQcQ9Ef79vAF9fMaE/4TD+3wBv8IDAQE=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_23E = expr_6E:int
        var_3_243 = newarray:byte[](byte.class, expr_6E:int)
        var_5_244 = expr_6E:int
        Label_0582:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(64)), ldc:int(0))) {
            var_0_253 = and:int(var_0_61:int, ldc:int(-1377858059))
            var_5_244 = add:int(var_5_244:int, ldc:int(-1))
            expr_25D = stack_2A6_2 = loadelement(stack_25D_0, var_5_244)
            
            if (cmplt:boolean(add:int(add:int(var_5_244:int, ldc:int(5)), neg:int(var_4_23E:int)), ldc:int(0))) {
                stack_2A6_2 = stack_283_0 = add:byte(expr_25D:byte, loadelement:byte(var_3_243:byte[], add:int(var_5_244:int, ldc:int(5))))
                goto(Label_0659)
            }
            
            Label_0618:
            
            if (cmpne:boolean(and:int(var_0_253:int, ldc:int(64)), ldc:int(0))) {
                var_0_253 = and:int(var_0_253:int, ldc:int(1146253690))
            }
            else {
                var_0_253 = and:int(var_0_253:int, ldc:int(-1218445682))
                stack_2A6_2 = stack_283_0 = add:byte(expr_25D:byte, ldc:byte(5))
            }
            
            Label_0659:
            
            if (cmpne:boolean(and:int(var_0_253:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0618)
            }
            
            var_0_61 = and:int(var_0_253:int, ldc:int(-543465754))
            storeelement:byte(var_3_243:byte[], var_5_244:int, stack_2A6_2:byte)
            
            if (cmpne:boolean(var_5_244:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_116_0 = stack_118_0 = stack_156_0 = stack_25D_0 = stack_2E2_0 = stack_31D_0 = stack_373_0 = var_3_243:byte[]
            goto(Label_0115)
        }
        
        Label_0716:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1075859504))
            var_5_244 = add:int(var_5_244:int, ldc:int(-1))
            storeelement:byte(var_3_243:byte[], var_5_244:int, add:byte(loadelement:byte(stack_2E2_0:byte[], var_5_244:int), ldc:byte(30)))
            
            if (cmpne:boolean(var_5_244:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_116_0 = stack_118_0 = stack_156_0 = stack_25D_0 = stack_2E2_0 = stack_31D_0 = stack_373_0 = var_3_243:byte[]
            goto(Label_0172)
        }
        
        goto(Label_0582)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(1024)), ldc:int(0))) {
            var_0_80 = and:int(var_0_61:int, ldc:int(154090480))
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(524288)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-544625484))
            goto(Label_0229)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-853573855))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_23E = expr_A7:int
                var_3_243 = newarray:byte[](byte.class, expr_A7:int)
                var_5_244 = expr_A7:int
                goto(Label_0716)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(32)), ldc:int(0))) {
            var_0_80 = and:int(var_0_61:int, ldc:int(952148899))
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(681838585))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-1346650763))
            var_2_DC = stack_DC_0:byte[]
            expr_E0 = add:int(arraylength:int(stack_DE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E0:int, ldc:int(0))) {
                var_3_30B = newarray:byte[](byte.class, expr_E0:int)
                var_5_30C = expr_E0:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-945836623))
                    var_5_30C = add:int(var_5_30C:int, ldc:int(-1))
                    storeelement:byte(var_3_30B:byte[], var_5_30C:int, add:int(shl:int(loadelement:byte(stack_31D_0:byte[], var_5_30C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_DC:byte[], add:int(var_5_30C:int, and:int(ldc:int(16385), ldc:int(11323)))), ldc:int(2)), xor:int(ldc:int(25182), ldc:int(25185)))))
                    
                    if (cmpne:boolean(var_5_30C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_116_0 = stack_118_0 = stack_156_0 = stack_25D_0 = stack_2E2_0 = stack_31D_0 = stack_373_0 = var_3_30B:byte[]
            }
        }
        
        Label_0229:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4096)), ldc:int(0))) {
            var_0_80 = and:int(var_0_61:int, ldc:int(1721527998))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(512)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-1359431640))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_80 = and:int(var_0_61:int, ldc:int(-1483092250))
            expr_118 = arraylength:int(stack_118_0:byte[])
            
            if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                var_3_361 = newarray:byte[](byte.class, expr_118:int)
                var_5_362 = expr_118:int
                
                loop {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-1652982057))
                    var_5_362 = add:int(var_5_362:int, ldc:int(-1))
                    expr_376 = xor:byte(loadelement:byte(stack_373_0:byte[], var_5_362:int), ldc:byte(95))
                    storeelement:byte(var_3_361:byte[], var_5_362:int, or:int(and:int(shl:int(expr_376:byte, and:int(ldc:int(9110), ldc:int(1036))), ldc:int(-16)), and:int(shr:int(expr_376:byte[expected:int], and:int(ldc:int(388), ldc:int(18437))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_362:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DC_0 = stack_DE_0 = stack_116_0 = stack_118_0 = stack_156_0 = stack_25D_0 = stack_2E2_0 = stack_31D_0 = stack_373_0 = var_3_361:byte[]
            }
        }
        
        Label_0285:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_61 = and:int(var_0_80:int, ldc:int(-1031842292))
            goto(Label_0229)
        }
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(32)), ldc:int(0))) {
            var_0_61 = and:int(var_0_80:int, ldc:int(-1938091654))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(65536)), ldc:int(0))) {
            var_0_61 = and:int(var_0_80:int, ldc:int(73602745))
            goto(Label_0115)
        }
        
        var_3_162 = initobject:String(String::<init>, stack_156_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_237_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(47), ldc:int(4119)))
        expr_174 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31672), ldc:int(-31665)))
        storeelement:String(expr_174:String[], xor:int(ldc:int(8370), ldc:int(8374)), invokevirtual:String[expected:String](String::substring, var_3_162:String, and:int(ldc:int(14940), ldc:int(-32349)), and:int(ldc:int(12157), ldc:int(60))))
        storeelement:String(expr_174:String[], xor:int(ldc:int(-16127), ldc:int(-16121)), invokevirtual:String[expected:String](String::substring, var_3_162:String, and:int(ldc:int(6270), ldc:int(444)), and:int(ldc:int(116), ldc:int(23932))))
        storeelement:String(expr_174:String[], xor:int(ldc:int(17488), ldc:int(17489)), invokevirtual:String[expected:String](String::substring, var_3_162:String, xor:int(ldc:int(10482), ldc:int(10374)), and:int(ldc:int(1194), ldc:int(24811))))
        storeelement:String(expr_174:String[], and:int(ldc:int(1381), ldc:int(-4070)), invokevirtual:String[expected:String](String::substring, var_3_162:String, xor:int(ldc:int(196), ldc:int(110)), xor:int(ldc:int(2096), ldc:int(2289))))
        storeelement:String(expr_174:String[], xor:int(ldc:int(515), ldc:int(512)), invokevirtual:String[expected:String](String::substring, var_3_162:String, and:int(ldc:int(195), ldc:int(493)), xor:int(ldc:int(-15266), ldc:int(-15190))))
        storeelement:String(expr_174:String[], xor:int(ldc:int(2050), ldc:int(2055)), invokevirtual:String[expected:String](String::substring, var_3_162:String, and:int(ldc:int(502), ldc:int(17661)), xor:int(ldc:int(77), ldc:int(342))))
        storeelement:String(expr_174:String[], xor:int(ldc:int(17680), ldc:int(17682)), invokevirtual:String[expected:String](String::substring, var_3_162:String, and:int(ldc:int(8539), ldc:int(22971)), and:int(ldc:int(26949), ldc:int(4565))))
        putstatic:String[](\ub171\u8d98\u3bc9\u183a\u965f::\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0, expr_174:String[])
    }
    
    public void \u8640\u6c56\ub113\ubb2b\u647c\uae5d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_648 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_653 : int
        
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
        var_3_648 = and:int(ldc:int(1595718284), ldc:int(516946920))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub171\u8d98\u3bc9\u183a\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_648 = and:int(var_3_648:int, ldc:int(-557516371))
            var_5_81 = and:int(ldc:int(3661), ldc:int(-3664))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10688), ldc:int(-10689)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_648:int, ldc:int(511311003))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, xor:int(ldc:int(4160), ldc:int(4161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(12513), ldc:int(2569)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_648 = and:int(var_3_D9:int, ldc:int(-7881560))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(769), ldc:int(2055)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(805508352))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1736225788))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1360486439))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(1)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-2031031618))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0714)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(83629797))
                    }
                    else {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1836852))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1851602055))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(800799729))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1993043460))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-697761763))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-548554052))
                        var_11_EA = and:int(ldc:int(30224), ldc:int(-32305))
                        goto(Label_1495)
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1526746845))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1253818364))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(128)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(254163643))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(64)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1419863697))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1663218888))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-707244111))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(503970185))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0714:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(870744111))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1716307155))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-409111160))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(2021348799))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-4587894))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-256012031))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0714)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(1587085276))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = xor:int(ldc:int(1601), ldc:int(1600))
                                goto(Label_1094)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1592339219))
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0714)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1572077552))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-1097988621))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(1264055811))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1620198743))
                        var_11_EA = and:int(ldc:int(-25396), ldc:int(8499))
                    }
                    
                    Label_1094:
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(722835942))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0714)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(168078667))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(494265293))
                            loopcontinue()
                        }
                        
                        var_3_648 = and:int(var_3_648:int, ldc:int(1062336652))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1336)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-702050437))
                            goto(Label_1094)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(433742723))
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(777986155))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0714)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_648:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-402951997))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_648 = and:int(var_3_648:int, ldc:int(-6554418))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                            goto(Label_1495)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1336:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-525006778))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-205519243))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1684879090))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(16)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-579774000))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-139361499))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(510928984))
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(415432608))
                        loopcontinue()
                    }
                    
                    var_3_648 = and:int(var_3_648:int, ldc:int(521190349))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1495:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_653 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1506:
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1013861771))
                        goto(Label_1336)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(1960759846))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0714)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(32)), ldc:int(0))) {
                        var_3_648 = and:int(var_3_648:int, ldc:int(-1083852547))
                        var_17_653 = add:int(var_16_118:int, xor:int(ldc:int(5256), ldc:int(5257)))
                        looporswitchbreak()
                    }
                    
                    var_3_648 = and:int(var_3_648:int, ldc:int(-490830677))
                }
                
                var_3_648 = and:int(var_3_648:int, ldc:int(1593703309))
                
                if (cmple:boolean(var_5_81 = var_17_653:int, sub:int(var_6_88:int, and:int(ldc:int(17437), ldc:int(8579))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_648:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_648 = and:int(var_3_648:int, ldc:int(-1019675650))
            goto(Label_0108)
        }
    }
}
