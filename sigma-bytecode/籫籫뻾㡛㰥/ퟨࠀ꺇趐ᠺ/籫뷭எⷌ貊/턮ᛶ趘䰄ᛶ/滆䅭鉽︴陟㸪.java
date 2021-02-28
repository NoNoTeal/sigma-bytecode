public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6ec6\u416d\u927d\ufe34\u965f\u3e2a {
    public void decode(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1, java.util.List<java.lang.Object> p2) {
        var_4_50F : int
        var_4_222 : int
        var_7_22E : int
        var_8_242 : ByteBuf
        var_9_33F : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        var_10_354 : \uf94d\u4c04\u120d\uae5d\u8aa5\u416d
        var_9_465 : Throwable
        
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
            var_4_50F = and:int(ldc:int(718856369), ldc:int(714789800))
            
            loop {
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0342)
                }
                
                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(363403120))
                    goto(Label_0273)
                }
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(2133818625))
                    goto(Label_0214)
                }
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(-606349819))
                    
                    if (cmple:boolean(invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0165:
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0342)
                }
                
                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(-833075916))
                    goto(Label_0273)
                }
                
                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_50F = and:int(var_4_50F:int, ldc:int(1068758644))
                }
                
                Label_0214:
                
                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(2146541497))
                    goto(Label_0342)
                }
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_50F = and:int(var_4_50F:int, ldc:int(803183044))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u8709\ufcaf\u4e72\u62da\u6cfe\ubf56, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::\u34df\u927d\ufcaf\u8d90\ud4fe\u6d69, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a)))) {
                        invokevirtual:boolean(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4f52\ub171\u8d98\u9033\uc7fe\u6b0d, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::\u34df\u927d\ufcaf\u8d90\ud4fe\u6d69, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_1266)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                var_4_50F = and:int(var_4_50F:int, ldc:int(923681192))
                                goto(Label_0507)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(33554432)), ldc:int(0))) {
                                var_4_50F = and:int(var_4_50F:int, ldc:int(-1078077509))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u494c\ud12e\u7ce1\u2dcc\u9255\u4f52, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::\u34df\u927d\ufcaf\u8d90\ud4fe\u6d69, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a)))) {
                                    invokevirtual:ByteBuf(ByteBuf::retain, p1:ByteBuf)
                                    goto(Label_1266)
                                }
                            }
                            
                            Label_0466:
                            
                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_1266)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(65536)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_4_50F = and:int(var_4_50F:int, ldc:int(-1481924458))
                                    loopcontinue()
                                }
                                
                                var_4_50F = and:int(var_4_50F:int, ldc:int(-1612911270))
                            }
                            
                            Label_0507:
                            
                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2)), ldc:int(0))) {
                                var_4_50F = and:int(var_4_50F:int, ldc:int(-1481563921))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0466)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(33554432)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_4_222 = and:int(var_4_50F:int, ldc:int(200458286))
                                var_7_22E = invokevirtual:int(Integer::intValue, invokevirtual:Integer(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p1:ByteBuf))
                                var_4_50F = and:int(var_4_222:int, ldc:int(2077419165))
                                var_8_242 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokeinterface:ByteBufAllocator(ChannelHandlerContext::alloc, p0:ChannelHandlerContext))
                                
                                try {
                                    loop {
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(32768)), ldc:int(0))) {
                                            goto(Label_1061)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(4)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(350705655))
                                            goto(Label_0991)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-891514216))
                                            goto(Label_0909)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(65536)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-360507396))
                                            goto(Label_0726)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(2)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(1874169731))
                                            
                                            if (cmpne:boolean(var_7_22E:int, and:int(ldc:int(14314), ldc:int(3049)))) {
                                                var_9_33F = initobject:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::<init>, var_7_22E:int, p1:ByteBuf, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::\u34df\u927d\ufcaf\u8d90\ud4fe\u6d69, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a))
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(-1143101093))
                                                var_10_354 = checkcast:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf94d\u4c04\u120d\uae5d\u8aa5\u416d.class, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::\u34df\u927d\ufcaf\u8d90\ud4fe\u6d69, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a), ldc:Class<\uf94d\u4c04\u120d\uae5d\u8aa5\u416d>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf94d\u4c04\u120d\uae5d\u8aa5\u416d.class)))
                                                
                                                do {
                                                    if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(4)), ldc:int(0))) {
                                                        var_4_50F = and:int(var_4_50F:int, ldc:int(2079969248))
                                                        invokevirtual:void(\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6::\ud217\uff55\ud523\u59ec\u965f\ua61f, invokevirtual:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u34df\u8d90\ub19c\ua6bd\u7e3f\u6cfe, var_10_354:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d), getstatic:\u7006\u6d69\uc910\u7ce1\u4975\u718f(\u7006\u6d69\uc910\u7ce1\u4975\u718f::\uc2e8\u12cb\u9937\u836c\u3e2a\u960f), invokevirtual:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u836c\u759a\ub6ab\u3d64\u2dcc\ua3b4, var_10_354:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d), var_9_33F:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                                                    }
                                                } while (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0)))
                                                
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(-336465042))
                                                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6fb0\u7bad\u0a06\u8640\u61a4\ub7dc, var_9_33F:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_8_242:ByteBuf)
                                                goto(Label_0909)
                                            }
                                        }
                                        
                                        Label_0669:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                            goto(Label_1061)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(1452656316))
                                            goto(Label_0991)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                                            goto(Label_0909)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                                                loopcontinue()
                                            }
                                            
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(1811268138))
                                        }
                                        
                                        Label_0726:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(2102923188))
                                            goto(Label_1061)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-215258126))
                                            goto(Label_0991)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2147483647)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0))) {
                                                goto(Label_0669)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(4)), ldc:int(0))) {
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(196346373))
                                                loopcontinue()
                                            }
                                            
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(784058879))
                                            invokevirtual:ByteBuf(ByteBuf::writeBytes, var_8_242:ByteBuf, p1:ByteBuf)
                                        }
                                        
                                        Label_0909:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-1969436961))
                                            goto(Label_1061)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(134217728)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(32768)), ldc:int(0))) {
                                                goto(Label_0726)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(1234415858))
                                                goto(Label_0669)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(65536)), ldc:int(0))) {
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(981835556))
                                                loopcontinue()
                                            }
                                            
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(1004118114))
                                            invokevirtual:ByteBuf(ByteBuf::clear, p1:ByteBuf)
                                        }
                                        
                                        Label_0991:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-1485813488))
                                        }
                                        else {
                                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_0909)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2)), ldc:int(0))) {
                                                goto(Label_0726)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2)), ldc:int(0))) {
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(357024148))
                                                goto(Label_0669)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0))) {
                                                loopcontinue()
                                            }
                                            
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-290146526))
                                            p1 = var_8_242:ByteBuf
                                        }
                                        
                                        Label_1061:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(2147483647)), ldc:int(0))) {
                                            goto(Label_0991)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(33554432)), ldc:int(0))) {
                                            goto(Label_0909)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-1270022238))
                                            goto(Label_0726)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(8)), ldc:int(0))) {
                                            goto(Label_0669)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(4)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    var_4_50F = and:int(var_4_50F:int, ldc:int(-1948259574))
                                }
                                catch (java.lang.Throwable var_9_465) {
                                    loop {
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(32768)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(1595859306))
                                            goto(Label_1224)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(382117044))
                                        }
                                        else {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(-1617104230))
                                            invokevirtual:ByteBuf(ByteBuf::clear, p1:ByteBuf)
                                        }
                                        
                                        Label_1175:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(1168139466))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                                                var_4_50F = and:int(var_4_50F:int, ldc:int(111855504))
                                                loopcontinue()
                                            }
                                            
                                            var_4_50F = and:int(var_4_50F:int, ldc:int(261546529))
                                            invokevirtual:boolean(ByteBuf::release, var_8_242:ByteBuf)
                                        }
                                        
                                        Label_1224:
                                        
                                        if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(8388608)), ldc:int(0))) {
                                            goto(Label_1175)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(134217728)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                    }
                                    
                                    athrow(var_9_465:Throwable)
                                }
                            }
                            
                            Label_1266:
                            
                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_0507)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0466)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(2147483647)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_4_50F = and:int(var_4_50F:int, ldc:int(1049877126))
                        invokeinterface:boolean(List<ByteBuf>::add, p2:List<ByteBuf>, p1:ByteBuf)
                        looporswitchbreak()
                    }
                }
                
                Label_0273:
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(8)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(-688117315))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_4_50F = and:int(var_4_50F:int, ldc:int(-1431270806))
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_4_50F = and:int(var_4_50F:int, ldc:int(-870838613))
                        loopcontinue()
                    }
                    
                    var_4_50F = and:int(var_4_50F:int, ldc:int(2056573472))
                }
                
                Label_0342:
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(-1577229868))
                    goto(Label_0273)
                }
                
                if (cmpne:boolean(and:int(var_4_50F:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0214)
                }
                
                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_50F = and:int(var_4_50F:int, ldc:int(-498431936))
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_4_50F:int, ldc:int(2048)), ldc:int(0))) {
                    return:void()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext p0, java.lang.Throwable p1) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\uff55\u7ce1\u9033\u4975\uc246\u9af2, p1:Throwable, ldc:Class<\u7d52\uc238\u12b2\u6198\u527a\ubefe>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u7d52\uc238\u12b2\u6198\u527a\ubefe.class)))) {
            invokespecial:void(MessageToMessageDecoder::exceptionCaught, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a[expected:MessageToMessageDecoder], p0:ChannelHandlerContext, p1:Throwable)
        }
    }
    
    public void \u6ec6\u416d\u927d\ufe34\u965f\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
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
            invokespecial:MessageToMessageDecoder(MessageToMessageDecoder::<init>, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a)
            putfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::\u34df\u927d\ufcaf\u8d90\ud4fe\u6d69, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void decode(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1, java.util.List p2) {
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
            invokevirtual:void(\u6ec6\u416d\u927d\ufe34\u965f\u3e2a::decode, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a, p0:ChannelHandlerContext, checkcast:ByteBuf(io.netty.buffer.ByteBuf.class, p1:Object[expected:ByteBuf]), p2:List<Object>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub70c\ud12e\u836c\u8709\ubcb0\u446c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61E : int
        var_5_7E : int
        var_6_85 : int
        var_7_94 : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_629 : int
        
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
        var_3_61E = and:int(ldc:int(393806834), ldc:int(-273095941))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6ec6\u416d\u927d\ufe34\u965f\u3e2a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0168)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_61E = and:int(var_3_61E:int, ldc:int(-746706178))
            var_5_7E = and:int(ldc:int(20169), ldc:int(-20170))
            var_6_85 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_94 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12822), ldc:int(12821)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_61E:int, ldc:int(1262363347))
                    var_9_C5 = sub:double(var_7_94:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_7E:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_85:int, and:int(ldc:int(25223), ldc:int(7169)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, xor:int(ldc:int(-32754), ldc:int(-32753)))), var_7_94:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_61E = and:int(var_3_D7:int, ldc:int(725547866))
                    var_14_112 = var_7_94:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7E:int), and:int(ldc:int(1617), ldc:int(133)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_85:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-923764246))
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1606647817))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-154270556))
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1904588362))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(823007443))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1038368929))
                    }
                    else {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(595515258))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_85:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(974836276))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-255486788))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(973791945))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(351405836))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(465556442))
                        var_11_E8 = and:int(ldc:int(-14137), ldc:int(13872))
                        goto(Label_1467)
                    }
                    
                    Label_0580:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(34586699))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1038825830))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(999882886))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-2020935224))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(398280318))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0699:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1082974201))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-803167894))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1086421253))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1415711051))
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-836659529))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-626609421))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(603819766))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E:int), var_7_94:double)) {
                                var_11_E8 = and:int(ldc:int(16449), ldc:int(17))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0920:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1636031682))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1123950779))
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1750400037))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1763432705))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(2012780410))
                        var_11_E8 = and:int(ldc:int(20076), ldc:int(-20077))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(346440209))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(385048274))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-302493010))
                            goto(Label_0920)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1289815432))
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-162080256))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1274817495))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1335)
                            }
                        }
                    }
                    
                    Label_1204:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(795028595))
                        goto(Label_1478)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-2139184971))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-515923573))
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0920)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1307911508))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(939027059))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_7E:int, var_16_116:int)
                        goto(Label_1467)
                    }
                    
                    Label_1335:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1478)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(751868549))
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-719014507))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-553238977))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(2087207677))
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61E = and:int(var_3_61E:int, ldc:int(1333457786))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1467:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_629 = var_5_7E:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1478:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(907195300))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1633990212))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1866453586))
                        var_17_629 = add:int(var_16_116:int, xor:int(ldc:int(2224), ldc:int(2225)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61E = and:int(var_3_61E:int, ldc:int(1341863638))
                
                if (cmple:boolean(var_5_7E = var_17_629:int, sub:int(var_6_85:int, xor:int(ldc:int(-16384), ldc:int(-16383))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0168:
        
        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(16)), ldc:int(0))) {
            var_3_61E = and:int(var_3_61E:int, ldc:int(1480311544))
            goto(Label_0106)
        }
    }
}
